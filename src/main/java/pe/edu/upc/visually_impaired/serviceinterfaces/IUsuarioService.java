package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario> list();

    public void delete(int id);

    public Usuario listId(int id);
    public List<String[]> cantidadporGenero();
    public int GetIdByEmail(String emailusr);
    public int ultimoidregistrado();
}
