package Controladores;

import Entidades.Usuario;
import Servicios.UsuarioService;
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

    // Otros métodos del controlador...

    // Endpoint para crear un nuevo usuario
    @PostMapping("/crear")
    public String crearUsuario(@RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
        logger.info("log: Usuario creado.");
        logger.error("log: Ocurrió un error al crear usuario.");
        return "Usuario creado exitosamente";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obtenerUsuarioPorId(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.obtenerUsuarioPorId(id);

        if (usuario.isPresent()) {
            // Devolver el usuario y un mensaje de ok
            return ResponseEntity.ok("Usuario encontrado: " + usuario);
        } else {
            // Si no se encuentra el usuario, devolver un mensaje de error
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
    }
}
