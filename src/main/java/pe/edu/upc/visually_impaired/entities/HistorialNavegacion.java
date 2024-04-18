package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
@Entity
@Table(name = "HistorialNavegacion")
public class HistorialNavegacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "ruta_id")
    private Rutas_seguras rutas_seguras;
    @Column(name = "fechayhora_inicio",nullable = false)
    private LocalDateTime fechayhora_inicio;
    @Column(name = "fechayhora_destino",nullable = false)
    private LocalDateTime fechayhora_destino;
    @Column(name = "detalles",nullable = false, length = 250)
    private String detalles;

    public HistorialNavegacion() {
    }

    public HistorialNavegacion(int id, Usuario usuario, Rutas_seguras rutas_seguras, LocalDateTime fechayhora_inicio, LocalDateTime fechayhora_destino, String detalles) {
        this.id = id;
        this.usuario = usuario;
        this.rutas_seguras = rutas_seguras;
        this.fechayhora_inicio = fechayhora_inicio;
        this.fechayhora_destino = fechayhora_destino;
        this.detalles = detalles;
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

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
