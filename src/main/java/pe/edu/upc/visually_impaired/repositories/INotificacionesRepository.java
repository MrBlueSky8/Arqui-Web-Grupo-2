package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Notificaciones;

import java.util.List;

@Repository
public interface INotificacionesRepository extends JpaRepository<Notificaciones, Integer> {
    @Query(value = "select id, contenido, fechayhora\n" +
            "from Notificaciones\n" +
            "where usuario_id = :idUsuario\n" +
            "and estado = false", nativeQuery = true)
    public List<String[]> notificacionesinleer(int idUsuario); //Fabrizio
}
