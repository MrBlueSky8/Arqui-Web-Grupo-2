package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IHistorialNavegacionRepository extends JpaRepository<HistorialNavegacion, Integer> {
    @Query(value = "select rs.id, rs.punto_origen, rs.punto_destino, COUNT(*) AS Ruta_mas_transitada\n" +
            "from rutas_seguras rs\n" +
            "inner join historial_navegacion hn ON rs.id = hn.ruta_id\n" +
            "where hn.finalizado = true\n" +
            "group by  rs.id, rs.punto_origen, rs.punto_destino\n" +
            "order by  Ruta_mas_transitada desc LIMIT 1;\n", nativeQuery = true)
    public List<String[]> Ruta_mas_transitada(); //joaquin
    @Query(value =  "SELECT rs.punto_destino,rs.punto_origen,hn.fechayhora_inicio,hn.fechayhora_destino,hn.detalles,hn.finalizado \n" +
                    "FROM historial_navegacion hn \n" +
                    "INNER JOIN rutas_seguras rs ON hn.usuario_id=rs.id\n " +
                    "WHERE hn.usuario_id=:usuarioId AND hn.fechayhora_destino>=:fecha",nativeQuery = true)
    public List<String[]> FiltrarHistorialXFecha(@Param("usuarioId")int usuarioId,@Param("fecha") LocalDate fechas);//Mary

    @Query(value =  "SELECT rs.punto_destino,rs.punto_origen,hn.fechayhora_inicio,hn.fechayhora_destino,hn.detalles,hn.finalizado \n" +
                    "FROM historial_navegacion hn \n" +
                    "INNER JOIN rutas_seguras rs ON hn.usuario_id = rs.id \n" +
                    "WHERE \n" +
                    "    hn.usuario_id =:usuarioId \n" +
                    "    AND ((:periodo='hoy' AND fechayhora_destino >= CURRENT_DATE AND fechayhora_destino < CURRENT_DATE + INTERVAL '1 day') \n" +
                    "        OR (:periodo='ayer' AND fechayhora_destino >= CURRENT_DATE - INTERVAL '1 day' AND fechayhora_destino < CURRENT_DATE) \n" +
                    "        OR (:periodo='ultima semana' AND fechayhora_destino >= CURRENT_DATE - INTERVAL '7 days' AND fechayhora_destino < CURRENT_DATE)) \n",nativeQuery = true)
    public List<String[]> HistorialNavegacion_Por_Periodo(@Param("usuarioId")int usuarioId,@Param("periodo")String periodos);
}
