package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.ComentaiosValoracionesRutas;

import java.util.List;

@Repository
public interface IComentariosValoracionesRutasRepository extends JpaRepository<ComentaiosValoracionesRutas, Integer> {
    @Query(value = "Select r.*, cvr.valoracion \n" +
            "From rutas_seguras r \n" +
            "Join historial_navegacion hn On r.id = hn.ruta_id \n" +
            "Join comentaios_valoraciones_rutas cvr On hn.id = cvr.historialnavegacionid \n" +
            "Where cvr.valoracion > 10; ", nativeQuery = true)
    public List<String[]> valoracionesRutas(); //Mafer
}
