package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Eventos;

import java.util.List;

@Repository
public interface IEventosRepository extends JpaRepository<Eventos, Integer> {
    @Query(value = "select e.id_evento, te.tipo_de_evento, e.descripcion, e.fecha\n" +
            "from eventos e\n" +
            "inner join tipos_evento te on e.tipo_evento_id = te.id\n" +
            "where e.fecha >= current_date\n" +
            "order by e.fecha asc", nativeQuery = true)
    public List<String[]> eventosxvenir(); //Fabrzio

    @Query(value = "select te.tipo_de_evento, count(*) as cantidad_eventos\n" +
            "from Eventos e\n" +
            "inner join tipos_evento te on e.tipo_evento_id = te.id\n" +
            "where e.fecha < current_date\n" +
            "group by te.tipo_de_evento\n" +
            "order by cantidad_eventos desc", nativeQuery = true)
    public List<String[]> eventospasadosBytipoevento(); //Alex


}
