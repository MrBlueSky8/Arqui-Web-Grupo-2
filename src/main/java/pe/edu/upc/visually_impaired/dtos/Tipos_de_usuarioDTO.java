package pe.edu.upc.visually_impaired.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.visually_impaired.entities.Usuario;

public class Tipos_de_usuarioDTO {
    private int id;
    private String rol;
    private UsuarioDTO user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UsuarioDTO getUser() {
        return user;
    }

    public void setUser(UsuarioDTO user) {
        this.user = user;
    }
}
