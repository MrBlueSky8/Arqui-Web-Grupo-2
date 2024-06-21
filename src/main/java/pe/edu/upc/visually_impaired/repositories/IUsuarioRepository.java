package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findByEmail(String username);

    @Query(value = "Select genero, Count(*) As cantidad_usuarios \n" +
            "From Usuario \n" +
            "Group By genero; ",nativeQuery = true)
    public List<String[]> cantidadporGenero(); //Mafer

    @Query(value = "select id_usuario from usuario where email= :emailusr",nativeQuery = true)
    public int GetIdByEmail(String emailusr);

}
