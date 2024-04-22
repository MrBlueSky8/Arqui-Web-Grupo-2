package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Rutas_seguras;

import java.util.List;

@Repository
public interface IRutas_segurasRepository extends JpaRepository<Rutas_seguras,Integer> {
    @Query(value = "SELECT distancia, punto_destino, punto_origen\n" +
            "FROM rutas_seguras\n" +
            "WHERE distancia <= :distanciaingresada", nativeQuery = true)
    public List<String[]> rutasSegurasanterioresxDistancia(int distanciaingresada); //Joaquin

    @Query(value = "select r.punto_origen, r.punto_destino, r.descripcion, \n" +
            "       avg(extract(EPOCH from (hn.fechayhora_destino - hn.fechayhora_inicio)) / 60) as tiempo_promedio_navegacion_minutos\n" +
            "from rutas_seguras r\n" +
            "left join historial_navegacion hn on r.id = hn.ruta_id\n" +
            "group by r.punto_origen, r.punto_destino, r.descripcion", nativeQuery = true)
    public List<String[]> tiempopromedioxruta(); //Alex


}