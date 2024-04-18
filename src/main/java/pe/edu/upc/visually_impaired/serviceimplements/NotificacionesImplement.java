package pe.edu.upc.visually_impaired.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.visually_impaired.entities.Notificaciones;
import pe.edu.upc.visually_impaired.repositories.INotificacionesRepository;
import pe.edu.upc.visually_impaired.serviceinterfaces.INotificacionesService;

import java.util.List;
@Service
public class NotificacionesImplement implements INotificacionesService {
    @Autowired
    private INotificacionesRepository nR;
    @Override
    public void insert(Notificaciones notificaciones){
        nR.save(notificaciones);
    }
    @Override
    public List<Notificaciones> list(){
        return nR.findAll();
    }
    @Override
    public void delete(int id){
        nR.deleteById(id);
    }
    @Override
    public Notificaciones listId(int id){
        return nR.findById(id).orElse(new Notificaciones());
    }
}
