package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Tipos_notificacion;
import pe.edu.upc.visually_impaired.repositories.ITipos_NoticiacionRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.ITipos_notificacionService;

import java.util.List;

@Service
public class Tipos_notificacionImplement implements ITipos_notificacionService {
    @Autowired
    private ITipos_NoticiacionRepository nR;

    @Override
    public void insert(Tipos_notificacion tipos_notificacion) {
        nR.save(tipos_notificacion);
    }

    @Override
    public List<Tipos_notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public Tipos_notificacion listId(int id)  {
        return nR.findById(id).orElse(new Tipos_notificacion());
    }
}
