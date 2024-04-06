package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;
import pe.edu.upc.visually_impaired.entities.Tipos_evento;

import java.util.List;

public interface ITipos_eventoService {
    public void insert(Tipos_evento tipos_evento);
    public List<Tipos_evento> list();
    public void delete(int id);
    public Tipos_evento listId(int id);
}
