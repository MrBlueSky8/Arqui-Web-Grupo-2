package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
    @Query(value =  "SELECT tn.tipo_notificacion,n.estado,n.contenido \n" +
                    "FROM notificaciones n\n" +
                    "JOIN tipos_notificacion tn ON n.tipos_de_notificacion_id = tn.id \n" +
                    "WHERE tn.tipo_notificacion =:tipo \n" +
                    "AND n.usuario_id =:idUsuario",nativeQuery = true)
    public List<String[]> notifiacionesXtipo(@Param("tipo")String tipos,@Param("idUsuario")int idUsuarios);//Mary
    //Nuevo query
    @Query(value =  "SELECT tn.tipo_notificacion, COUNT(*) AS cantidad_notificaciones \n" +
                    "FROM notificaciones n \n" +
                    "JOIN tipos_notificacion tn ON n.tipos_de_notificacion_id = tn.id \n" +
                    "GROUP BY tn.tipo_notificacion ",nativeQuery = true)public List<String[]>NotificacionesXTipo();
}
