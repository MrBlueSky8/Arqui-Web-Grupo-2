package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Eventos;
import pe.edu.upc.visually_impaired.repositories.IEventosRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.IEventosService;

import java.util.List;

@Service
public class EventosImplement implements IEventosService {
    @Autowired
    private IEventosRepository eR;

    @Override
    public void insert(Eventos eventos) {
        eR.save(eventos);
    }

    @Override
    public List<Eventos> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {eR.deleteById(id);}

    @Override
    public Eventos listId(int id) {return eR.findById(id).orElse(new Eventos());}

    @Override
    public List<String[]> eventosxvenir() {
        return eR.eventosxvenir();
    }

    @Override
    public List<String[]> eventospasadosBytipoevento() {
        return eR.eventospasadosBytipoevento();
    }
}
