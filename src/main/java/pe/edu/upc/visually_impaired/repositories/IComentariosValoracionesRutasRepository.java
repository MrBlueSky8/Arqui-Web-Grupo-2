package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.ComentaiosValoracionesRutas;

import java.util.List;

@Repository
public interface IComentariosValoracionesRutasRepository extends JpaRepository<ComentaiosValoracionesRutas, Integer> {
    @Query(value = "select r.id as id_ruta, r.punto_origen, r.punto_destino, r.descripcion, \n" +
            "avg(cvr.valoracion) as valoracion_promedio, \n" +
            "count(cvr.id) as cantidad_comentarios \n" +
            "from rutas_seguras r \n" +
            "left join historial_navegacion hn on r.id = hn.ruta_id \n" +
            "left join comentaios_valoraciones_rutas cvr on hn.id = cvr.historialnavegacionid \n" +
            "group by r.id, r.punto_origen, r.punto_destino, r.descripcion \n" +
            "order by valoracion_promedio desc \n", nativeQuery = true)
    public List<String[]> valoracionesRutas(); //Mafer
}
