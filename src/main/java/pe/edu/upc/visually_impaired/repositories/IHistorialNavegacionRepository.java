package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;

import java.util.List;

@Repository
public interface IHistorialNavegacionRepository extends JpaRepository<HistorialNavegacion, Integer> {
    @Query(value = "select rs.id, rs.punto_origen, rs.punto_destino, COUNT(*) AS Ruta_mas_transitada\n" +
            "from rutas_seguras rs\n" +
            "inner join historial_navegacion hn ON rs.id = hn.ruta_id\n" +
            "where hn.finalizado = true\n" +
            "group by  rs.id, rs.punto_origen, rs.punto_destino\n" +
            "order by  Ruta_mas_transitada desc LIMIT 1;\n", nativeQuery = true)
    public List<String[]> Ruta_mas_transitada();
}
