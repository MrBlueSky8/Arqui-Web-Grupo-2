package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Notificaciones")
public class Notificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "tipos_de_notificacion_id")
    private Tipos_notificacion tipo_notificacion;
    @Column(name = "contenido",nullable = false, length = 250)
    private String contenido;
    @Column(name = "fechayhora",nullable = false)
    private LocalDateTime fechayhora;
    @Column(name = "estado",nullable = false)
    private boolean estado;

    public Notificaciones() {
    }

    public Notificaciones(int id, Usuario usuario, Tipos_notificacion tipo_notificacion, String contenido, LocalDateTime fechayhora, boolean estado) {
        this.id = id;
        this.usuario = usuario;
        this.tipo_notificacion = tipo_notificacion;
        this.contenido = contenido;
        this.fechayhora = fechayhora;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tipos_notificacion getTipo_notificacion() {
        return tipo_notificacion;
    }

    public void setTipo_notificacion(Tipos_notificacion tipo_notificacion) {
        this.tipo_notificacion = tipo_notificacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(LocalDateTime fechayhora) {
        this.fechayhora = fechayhora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
