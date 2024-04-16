package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipos_notificacion")
public class Tipos_notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo_notificacion", nullable = false, length = 50)
    private String tipo_notificacion;

    public Tipos_notificacion() {
    }

    public Tipos_notificacion(int id, String tipo_notificacion) {
        this.id = id;
        this.tipo_notificacion = tipo_notificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_notificacion() {
        return tipo_notificacion;
    }

    public void setTipo_notificacion(String tipo_notificacion) {
        this.tipo_notificacion = tipo_notificacion;
    }
}
