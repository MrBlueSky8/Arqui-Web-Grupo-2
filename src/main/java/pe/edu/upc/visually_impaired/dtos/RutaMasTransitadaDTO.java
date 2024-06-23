package pe.edu.upc.visually_impaired.dtos;

public class RutaMasTransitadaDTO {
    private int id;
    private String descripcion;
    private String punto_origen;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private String punto_destino;
    private int ruta_mas_transitada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPunto_origen() {
        return punto_origen;
    }

    public void setPunto_origen(String punto_origen) {
        this.punto_origen = punto_origen;
    }

    public String getPunto_destino() {
        return punto_destino;
    }

    public void setPunto_destino(String punto_destino) {
        this.punto_destino = punto_destino;
    }

    public int getRuta_mas_transitada() {
        return ruta_mas_transitada;
    }

    public void setRuta_mas_transitada(int ruta_mas_transitada) {
        this.ruta_mas_transitada = ruta_mas_transitada;
    }
}
