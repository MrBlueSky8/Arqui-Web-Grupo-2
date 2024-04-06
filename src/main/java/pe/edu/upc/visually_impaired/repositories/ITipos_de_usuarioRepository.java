package pe.edu.upc.visually_impaired.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;

@Repository
public interface ITipos_de_usuarioRepository extends JpaRepository<Tipos_de_usuario,Integer> {

}
