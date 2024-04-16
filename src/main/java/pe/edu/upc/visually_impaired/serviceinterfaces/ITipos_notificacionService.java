package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.Tipos_notificacion;

import java.util.List;

public interface ITipos_notificacionService {
    public void insert(Tipos_notificacion tipos_notificacion);
    public List<Tipos_notificacion> list();

    public void delete(int id);

    public Tipos_notificacion listId(int id);
}
