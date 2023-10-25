package Repositories;

import Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

//chatgpt:
public interface UsuarioRepository extends JpaRepository <Usuario,Long> {

    Optional<Usuario> findById(Long id);

    Usuario findByNumeroDocumentoAndIdCarrera(String numeroDocumento, Long idCarrera);

    //usando @Query
    @Query("SELECT u FROM Usuario u WHERE u.idCarrera = :paramCarrera")
    List<Usuario> encontrarPorCarrera(@Param("paramCarrera") Long idCarrera);

}
