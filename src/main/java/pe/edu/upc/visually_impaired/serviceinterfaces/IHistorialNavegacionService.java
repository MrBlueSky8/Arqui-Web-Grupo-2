package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;

import java.util.List;

public interface IHistorialNavegacionService {
    public void insert(HistorialNavegacion historialNavegacion);
    public List<HistorialNavegacion> list();
    public void delete(int id);
    public HistorialNavegacion listId(int id);
    public List<String[]> Ruta_mas_transitada();
}
