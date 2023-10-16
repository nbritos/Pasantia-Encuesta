package Repositories;

import Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//chatgpt:
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
    Usuario findByDni(long dni);

    Usuario findByNumeroDocumentoAndIdCarrera(String numeroDocumento, Long idCarrera);
    //usando @Query

    @Query("SELECT u FROM tabla_usuarios WHERE u.idCarrera = paramCarrera")
    List<Usuario> encontrarPorCarrera(@Param("paramCarrera") int idCarrera);
}
