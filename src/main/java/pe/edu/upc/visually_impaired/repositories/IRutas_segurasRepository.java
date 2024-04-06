package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Rutas_seguras;

@Repository
public interface IRutas_segurasRepository extends JpaRepository<Rutas_seguras,Integer> {

}
