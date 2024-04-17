package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.Eventos;

import java.util.List;

public interface IEventosService {
    public void insert(Eventos eventos);
    public List<Eventos> list();

    public void delete(int id);

    public Eventos listId(int id);
}
