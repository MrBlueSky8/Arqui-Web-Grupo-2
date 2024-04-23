package pe.edu.upc.visually_impaired.dtos;

import java.time.LocalDateTime;

public class HistorialXFechaDTO {
    private String Destino;
    private String Origen;
    private LocalDateTime FechayHoraOrigen;
    private LocalDateTime FechayHoraDestino;
    private String Detalles;
    private Boolean Finalizado;

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public LocalDateTime getFechayHoraOrigen() {
        return FechayHoraOrigen;
    }

    public void setFechayHoraOrigen(LocalDateTime fechayHoraOrigen) {
        FechayHoraOrigen = fechayHoraOrigen;
    }

    public LocalDateTime getFechayHoraDestino() {
        return FechayHoraDestino;
    }

    public void setFechayHoraDestino(LocalDateTime fechayHoraDestino) {
        FechayHoraDestino = fechayHoraDestino;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String detalles) {
        Detalles = detalles;
    }

    public Boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        Finalizado = finalizado;
    }
}
