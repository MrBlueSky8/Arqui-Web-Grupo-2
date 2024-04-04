package pe.edu.upc.visually_impaired.dtos;

import jakarta.persistence.Column;

public class Rutas_segurasDTO {
    private int id;

    private String titleMovie;

    private int genderMovie;

    private String descripcion;

    private String informacion_general;
    public int getId(){
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
