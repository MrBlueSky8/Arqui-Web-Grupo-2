package pe.edu.upc.visually_impaired.dtos;

public class CantEventosPasadosByTeDTO {
    private String tipo_de_evento;
    private int cantidad_eventos;

    public String getTipo_de_evento() {
        return tipo_de_evento;
    }

    public void setTipo_de_evento(String tipo_de_evento) {
        this.tipo_de_evento = tipo_de_evento;
    }

    public int getCantidad_eventos() {
        return cantidad_eventos;
    }

    public void setCantidad_eventos(int cantidad_eventos) {
        this.cantidad_eventos = cantidad_eventos;
    }


}
