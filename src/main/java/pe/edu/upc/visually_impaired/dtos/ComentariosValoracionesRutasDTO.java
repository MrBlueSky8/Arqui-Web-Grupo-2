package pe.edu.upc.visually_impaired.dtos;

import pe.edu.upc.visually_impaired.entities.HistorialNavegacion;

public class ComentariosValoracionesRutasDTO {
    private int id;
    private int valoracion;
    private String comentario;
    private HistorialNavegacion historialnavegacionid;

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
