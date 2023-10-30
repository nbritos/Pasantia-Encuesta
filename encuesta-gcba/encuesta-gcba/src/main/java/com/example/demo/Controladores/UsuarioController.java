package com.example.demo.Controladores;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
    @Autowired
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Otros métodos del controlador...

    // Endpoint para crear un nuevo usuario
    @PostMapping("/crear")
    public String crearUsuario(@RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
        logger.info("log: Usuario creado.");
        logger.error("log: Ocurrió un error al crear usuario.");
        return "Usuario creado exitosamente";
    }

    @GetMapping("/documento/{documento}")
    public ResponseEntity<?> obtenerUsuarioPorDocumento(@PathVariable String documento) {
        Optional<Usuario> usuario = usuarioService.obtenerUsuarioPorDocumento(documento);

        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado para el documento: " + documento);
        }
    }
}
