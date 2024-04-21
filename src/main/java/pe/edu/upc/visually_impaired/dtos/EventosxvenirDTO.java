package pe.edu.upc.visually_impaired.dtos;

import java.time.LocalDate;

public class EventosxvenirDTO {
    private int idEvento;
    private String Tipo_de_evento;
    private String descripcion;
    private LocalDate fecha;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipo_de_evento() {
        return Tipo_de_evento;
    }

    public void setTipo_de_evento(String tipo_de_evento) {
        Tipo_de_evento = tipo_de_evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
