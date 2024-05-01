package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.ComentaiosValoracionesRutas;

import java.util.List;

@Repository
public interface IComentariosValoracionesRutasRepository extends JpaRepository<ComentaiosValoracionesRutas, Integer> {
    @Query(value = "SELECT\n" +
            "    r.id AS id_ruta,\n" +
            "    r.punto_origen,\n" +
            "    r.punto_destino,\n" +
            "    r.descripcion,\n" +
            "    AVG(cvr.valoracion) AS valoracion_promedio,\n" +
            "    COUNT(cvr.id) AS cantidad_comentarios\n" +
            "FROM\n" +
            "    Rutas_seguras r\n" +
            "LEFT JOIN\n" +
            "    historial_navegacion hn ON r.id = hn.ruta_id\n" +
            "LEFT JOIN\n" +
            "    comentaios_valoraciones_rutas cvr ON hn.id = cvr.historialnavegacionid\n" +
            "GROUP BY\n" +
            "    r.id,\n" +
            "    r.punto_origen,\n" +
            "    r.punto_destino,\n" +
            "    r.descripcion\n" +
            "ORDER BY\n" +
            "    valoracion_promedio DESC", nativeQuery = true)
    public List<String[]> valoracionesRutas(); //Mafer
}
