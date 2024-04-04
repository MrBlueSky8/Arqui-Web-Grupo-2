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
    private String titleMovie;
    @Column(name = "distancia",nullable = false)
    private int genderMovie;
    @Column(name = "descripcion",nullable = false,length =300)
    private String descripcion;
    @Column(name = "informacion_general",nullable = false,length =300)
    private String informacion_general;

    public Rutas_seguras() {
    }

    public Rutas_seguras(int id, String titleMovie, int genderMovie, String descripcion, String informacion_general) {
        this.id = id;
        this.titleMovie = titleMovie;
        this.genderMovie = genderMovie;
        this.descripcion = descripcion;
        this.informacion_general = informacion_general;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public int getGenderMovie() {
        return genderMovie;
    }

    public void setGenderMovie(int genderMovie) {
        this.genderMovie = genderMovie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInformacion_general() {
        return informacion_general;
    }

    public void setInformacion_general(String informacion_general) {
        this.informacion_general = informacion_general;
    }
}
