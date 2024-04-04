package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipos_evento")
public class Tipos_evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Tipo_de_evento",nullable = false,length =50)
    private String Tipo_de_evento;

    public Tipos_evento() {
    }

    public Tipos_evento(int id, String tipo_de_evento) {
        this.id = id;
        Tipo_de_evento = tipo_de_evento;
    }

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
