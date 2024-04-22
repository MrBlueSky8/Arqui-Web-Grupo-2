package pe.edu.upc.visually_impaired.dtos;

public class ValoracionpromedioRutasDTO {
    private int id;
    private String punto_origen;
    private String punto_destino;
    private String descripcion;
    private float valoracion_promedio;
    private int cantidad_comentarios;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValoracion_promedio() {
        return valoracion_promedio;
    }

    public void setValoracion_promedio(float valoracion_promedio) {
        this.valoracion_promedio = valoracion_promedio;
    }

    public int getCantidad_comentarios() {
        return cantidad_comentarios;
    }

    public void setCantidad_comentarios(int cantidad_comentarios) {
        this.cantidad_comentarios = cantidad_comentarios;
    }
}
