package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipos_de_usuario")
public class Tipos_de_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "rol",nullable = false,length =50)
    private String rol;

    public Tipos_de_usuario() {
    }

    public Tipos_de_usuario(int id, String rol) {
        this.id = id;
        this.rol = rol;
    }

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




