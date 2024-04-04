package pe.edu.upc.visually_impaired.dtos;

import jakarta.persistence.Column;

public class Tipos_de_usuarioDTO {
    private int id;
    private String rol;

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
}
