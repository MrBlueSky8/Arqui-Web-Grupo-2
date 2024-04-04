package pe.edu.upc.visually_impaired.dtos;

import jakarta.persistence.Column;

public class Tipos_eventoDTO {
    private int id;
    private String Tipo_de_evento;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_de_evento() {
        return Tipo_de_evento;
    }

    public void setTipo_de_evento(String tipo_de_evento) {
        Tipo_de_evento = tipo_de_evento;
    }
}
