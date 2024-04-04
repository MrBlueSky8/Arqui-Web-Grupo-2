package pe.edu.upc.visually_impaired.serviceinterfaces;

import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;

import java.util.List;
public interface ITipos_de_usuarioService {
    public void insert(Tipos_de_usuario tipos_de_usuario);
    public List<Tipos_de_usuario> list();
}
