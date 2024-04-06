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
    @Column(name = "lista_coordenas",nullable = false,length =200)
    private String lista_coordenas;

    public Rutas_seguras() {
    }

    public Rutas_seguras(int id, String punto_origen, String punto_destino, int distancia, String descripcion, String lista_coordenas) {
        this.id = id;
        this.punto_origen = punto_origen;
        this.punto_destino = punto_destino;
        this.distancia = distancia;
        this.descripcion = descripcion;
        this.lista_coordenas = lista_coordenas;
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

    public String getLista_coordenas() {
        return lista_coordenas;
    }

    public void setLista_coordenas(String lista_coordenas) {
        this.lista_coordenas = lista_coordenas;
    }
}
