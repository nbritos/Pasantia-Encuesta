package Servicios;

import Entidades.Usuario;
import Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findByNumeroDocumentoAndIdCarrera(String numeroDocumento, Long idCarrera) {
        return usuarioRepository.findByNumeroDocumentoAndIdCarrera(numeroDocumento, idCarrera);
    }

    // Otros métodos relacionados con la lógica de negocio de usuarios
}
