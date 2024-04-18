package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

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
    @Column(name = "hora_inicio",nullable = false)
    private LocalTime hora_inicio;
    @Column(name = "hora_destino",nullable = false)
    private LocalTime hora_destino;
    @Column(name = "detalles",nullable = false, length = 250)
    private String detalles;

    public HistorialNavegacion() {
    }

    public HistorialNavegacion(int id, Usuario usuario, Rutas_seguras rutas_seguras, LocalTime hora_inicio, LocalTime hora_destino, String detalles) {
        this.id = id;
        this.usuario = usuario;
        this.rutas_seguras = rutas_seguras;
        this.hora_inicio = hora_inicio;
        this.hora_destino = hora_destino;
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
