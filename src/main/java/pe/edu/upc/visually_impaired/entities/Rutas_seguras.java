package pe.edu.upc.visually_impaired.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Rutas_seguras")
public class Rutas_seguras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "punto_origen",nullable = false,length =100)
    private String punto_origen;
    @Column(name = "punto_destino",nullable = false,length =100)
    private String punto_destino;
    @Column(name = "distancia",nullable = false)
    private int distancia;
    @Column(name = "descripcion",nullable = false,length =100)
    private String descripcion;

    public Rutas_seguras() {
    }

    public Rutas_seguras(int id, String punto_origen, String punto_destino, int distancia, String descripcion) {
        this.id = id;
        this.punto_origen = punto_origen;
        this.punto_destino = punto_destino;
        this.distancia = distancia;
        this.descripcion = descripcion;
    }

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
