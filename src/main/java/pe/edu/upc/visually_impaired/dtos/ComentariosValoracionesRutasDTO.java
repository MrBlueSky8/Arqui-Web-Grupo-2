package pe.edu.upc.visually_impaired.dtos;


public class ComentariosValoracionesRutasDTO {
    private int id;
    private int valoracion;
    private String comentario;
    private HistorialNavegacionDTO historialnavegacionid;

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

    public HistorialNavegacionDTO getHistorialnavegacionid() {
        return historialnavegacionid;
    }

    public void setHistorialnavegacionid(HistorialNavegacionDTO historialnavegacionid) {
        this.historialnavegacionid = historialnavegacionid;
    }
}
