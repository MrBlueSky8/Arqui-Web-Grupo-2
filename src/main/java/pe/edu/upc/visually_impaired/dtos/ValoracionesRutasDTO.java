package pe.edu.upc.visually_impaired.dtos;

public class ValoracionesRutasDTO {
    private int distancia;
    private int id;
    private String descripcion;
    private String punto_destino;
    private String punto_origen;
    private String lista_coordenadas;
    private int valoracion;

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPunto_destino() {
        return punto_destino;
    }

    public void setPunto_destino(String punto_destino) {
        this.punto_destino = punto_destino;
    }

    public String getPunto_origen() {
        return punto_origen;
    }

    public void setPunto_origen(String punto_origen) {
        this.punto_origen = punto_origen;
    }

    public String getLista_coordenadas() {
        return lista_coordenadas;
    }

    public void setLista_coordenadas(String lista_coordenadas) {
        this.lista_coordenadas = lista_coordenadas;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}
