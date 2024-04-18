package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "ComentaiosValoracionesRutas")
public class ComentaiosValoracionesRutas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "valoracion", nullable = false)
    private int valoracion;
    @Column(name = "comentario", nullable = false, length = 500)
    private String comentario;
    @OneToOne
    @JoinColumn(name = "historialnavegacionid")
    private HistorialNavegacion historialnavegacionid;

    public ComentaiosValoracionesRutas() {
    }

    public ComentaiosValoracionesRutas(int id, int valoracion, String comentario, HistorialNavegacion historialnavegacionid) {
        this.id = id;
        this.valoracion = valoracion;
        this.comentario = comentario;
        this.historialnavegacionid = historialnavegacionid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public HistorialNavegacion getHistorialnavegacionid() {
        return historialnavegacionid;
    }

    public void setHistorialnavegacionid(HistorialNavegacion historialnavegacionid) {
        this.historialnavegacionid = historialnavegacionid;
    }
}
