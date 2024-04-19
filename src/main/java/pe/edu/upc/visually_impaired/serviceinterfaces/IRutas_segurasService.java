package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.Rutas_seguras;

import java.util.List;
public interface IRutas_segurasService {
    public void insert(Rutas_seguras rutas_Seguras);

    public List<Rutas_seguras> list();
    public void delete(int id);

    public Rutas_seguras listId(int id);

    public List<String[]> rutasSegurasanterioresxDistancia(int distanciaingresada);
}
