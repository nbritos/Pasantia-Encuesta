package Controladores;

import Entidades.Usuario;
import Repositories.UsuarioRepository;
import Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Otros métodos del controlador...

    // Endpoint para crear un nuevo usuario
    @PostMapping("/crear")
    public String crearUsuario(@RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
        return "Usuario creado exitosamente";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> obtenerUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.obtenerUsuarioPorDni(id);

        if (usuario != null) {
            // Devolver el usuario y un mensaje de ok
            return ResponseEntity.ok("Usuario encontrado: " + usuario);
        } else {
            // Si no se encuentra el usuario, devolver un mensaje de error
            return ResponseEntity.status(404).body("Usuario no encontrado");
        }
    }
}
