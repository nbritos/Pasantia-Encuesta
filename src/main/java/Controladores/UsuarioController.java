package Controladores;

import Entidades.Usuario;
import Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //endpoint para post
    @PostMapping("/login")
    public String loginUsuario(@RequestBody Usuario usuario){
        /*validaciones
        usuario.dni
        */

        //si existe
        return "Bienvenid@";
    }
}
