package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Tipos_notificacion;

@Repository
public interface ITipos_NoticiacionRepository extends JpaRepository<Tipos_notificacion,Integer> {

}
