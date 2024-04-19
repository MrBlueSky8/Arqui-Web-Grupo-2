package pe.edu.upc.visually_impaired.dtos;

public class RutaMasTransitadaDTO {
    private int id;
    private String punto_origen;
    private String punto_destino;
    private int cantidad_de_viajes;

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

    public int getCantidad_de_viajes(String s) {
        return cantidad_de_viajes;
    }

    public void setCantidad_de_viajes(int cantidad_de_viajes) {
        this.cantidad_de_viajes = cantidad_de_viajes;
    }
}
