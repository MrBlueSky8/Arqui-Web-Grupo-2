package pe.edu.upc.visually_impaired.dtos;

import pe.edu.upc.visually_impaired.entities.Tipos_notificacion;
import pe.edu.upc.visually_impaired.entities.Usuario;

import java.time.LocalDateTime;

public class NotificacionesDTO {
    private int id;
    private UsuarioDTO usuario;
    private Tipos_notificacion tipo_notificacion;
    private String contenido;
    private LocalDateTime fechayhora;
    private boolean estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
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
