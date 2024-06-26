package pe.edu.upc.visually_impaired.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.visually_impaired.entities.Notificaciones;

import java.util.List;

public interface INotificacionesService {
    public void insert(Notificaciones notificaciones);
    public List<Notificaciones> list();
    public void delete(int id);
    public Notificaciones listId(int id);
    public List<String[]> notificacionesinleer(int idUsuario);
    public List<String[]> notifiacionesXtipo(String tipos,int idUsuarios);
    List<String[]>NotificacionesXTipo();
}
