package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.ComentaiosValoracionesRutas;

import java.util.List;

public interface IComentariosValoracionesRutasService {
    public void insert(ComentaiosValoracionesRutas comentaiosValoracionesRutas);
    public List<ComentaiosValoracionesRutas> list();

    public void delete(int id);

    public ComentaiosValoracionesRutas listId(int id);
    public List<String[]> valoracionesRutas();
}
