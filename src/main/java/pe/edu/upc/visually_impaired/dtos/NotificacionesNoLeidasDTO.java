package pe.edu.upc.visually_impaired.dtos;

import java.time.LocalDateTime;

public class NotificacionesNoLeidasDTO {
    private int id;
    private String contenido;
    private LocalDateTime fechayhora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
