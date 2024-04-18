package pe.edu.upc.visually_impaired.dtos;

import pe.edu.upc.visually_impaired.entities.Rutas_seguras;
import pe.edu.upc.visually_impaired.entities.Usuario;

import java.time.LocalTime;

public class HistorialNavegacionDTO {
    private int id;
    private Usuario usuario;
    private Rutas_seguras rutas_seguras;
    private LocalTime hora_inicio;
    private LocalTime hora_destino;
    private String detalles;

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

    public Rutas_seguras getRutas_seguras() {
        return rutas_seguras;
    }

    public void setRutas_seguras(Rutas_seguras rutas_seguras) {
        this.rutas_seguras = rutas_seguras;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public LocalTime getHora_destino() {
        return hora_destino;
    }

    public void setHora_destino(LocalTime hora_destino) {
        this.hora_destino = hora_destino;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
