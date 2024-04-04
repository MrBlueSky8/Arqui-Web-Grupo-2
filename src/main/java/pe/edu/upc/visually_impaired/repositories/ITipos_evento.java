package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Tipos_evento;

@Repository
public interface ITipos_evento extends JpaRepository<Tipos_evento,Integer> {

}
