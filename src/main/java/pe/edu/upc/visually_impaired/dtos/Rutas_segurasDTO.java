package pe.edu.upc.visually_impaired.dtos;

import jakarta.persistence.Column;

public class Rutas_segurasDTO {
    private int id;
    private String punto_origen;
    private String punto_destino;
    private int distancia;
    private String descripcion;

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

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
