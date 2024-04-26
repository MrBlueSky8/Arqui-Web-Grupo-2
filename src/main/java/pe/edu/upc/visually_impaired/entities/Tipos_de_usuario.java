package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipos_de_usuario",uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "rol"})})
public class Tipos_de_usuario {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rol",nullable = false,length =50)
    private String rol;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario user;

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

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}




