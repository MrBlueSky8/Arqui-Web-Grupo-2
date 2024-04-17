package pe.edu.upc.visually_impaired.dtos;
import pe.edu.upc.visually_impaired.entities.Tipos_evento;
import pe.edu.upc.visually_impaired.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventosDTO {
    private int idEvento;
    private Tipos_evento tipoEvento;
    private String descripcion;
    private String coordenadas;
    private LocalDate fecha;
    //private LocalTime hora;
    private boolean estado;
    private Usuario usuario;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public Tipos_evento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Tipos_evento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
