package pe.edu.upc.visually_impaired.dtos;

import jakarta.persistence.Column;
import pe.edu.upc.visually_impaired.entities.Rutas_seguras;
import pe.edu.upc.visually_impaired.entities.Usuario;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class HistorialNavegacionDTO {
    private int id;
    private UsuarioDTO usuario;
    private Rutas_seguras rutas_seguras;
    private LocalDateTime fechayhora_inicio;
    private LocalDateTime fechayhora_destino;
    private boolean finalizado;
    private String detalles;

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

    public Rutas_seguras getRutas_seguras() {
        return rutas_seguras;
    }

    public void setRutas_seguras(Rutas_seguras rutas_seguras) {
        this.rutas_seguras = rutas_seguras;
    }

    public LocalDateTime getFechayhora_inicio() {
        return fechayhora_inicio;
    }

    public void setFechayhora_inicio(LocalDateTime fechayhora_inicio) {
        this.fechayhora_inicio = fechayhora_inicio;
    }

    public LocalDateTime getFechayhora_destino() {
        return fechayhora_destino;
    }

    public void setFechayhora_destino(LocalDateTime fechayhora_destino) {
        this.fechayhora_destino = fechayhora_destino;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
