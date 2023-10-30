package com.example.demo.Servicios;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> obtenerUsuarioPorDocumento(String documento) {
        return usuarioRepository.findByDocumento(documento);
    }
    /*public Usuario findByNumeroDocumentoAndIdCarrera(String numeroDocumento, Long idCarrera) {
        return usuarioRepository.findByNumeroDocumentoAndIdCarrera(numeroDocumento, idCarrera);
    }*/

    @Transactional
    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    // Otros métodos relacionados con la lógica de negocio de usuarios
}
