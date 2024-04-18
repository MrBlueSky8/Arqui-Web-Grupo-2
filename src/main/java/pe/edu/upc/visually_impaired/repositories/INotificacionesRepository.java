package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Notificaciones;

@Repository
public interface INotificacionesRepository extends JpaRepository<Notificaciones, Integer> {

}
