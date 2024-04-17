package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvento;
    @ManyToOne
    @JoinColumn(name = "tipo_evento_id")
    private Tipos_evento tipoEvento;
    @Column(name = "descripcion", nullable = false, length = 250)
    private String descripcion;
    @Column(name = "coordenadas", nullable = false, length = 250)
    private String coordenadas;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    //@Column(name = "hora", nullable = false)
    //private LocalTime hora; falta checar de nuevo con la hora
    @Column(name = "estado", nullable = false, length = 250)
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_usuario_reporte")
    private Usuario usuario;

    public Eventos() {
    }

    public Eventos(int idEvento, Tipos_evento tipoEvento, String descripcion, String coordenadas, LocalDate fecha, boolean estado, Usuario usuario) {
        this.idEvento = idEvento;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.coordenadas = coordenadas;
        this.fecha = fecha;
        //this.hora = hora;
        this.estado = estado;
        this.usuario = usuario;
    }

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
