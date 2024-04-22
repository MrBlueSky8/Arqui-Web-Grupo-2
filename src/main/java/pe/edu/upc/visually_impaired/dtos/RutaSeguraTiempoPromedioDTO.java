package pe.edu.upc.visually_impaired.dtos;

public class RutaSeguraTiempoPromedioDTO {
    private String punto_origen;
    private String punto_destino;
    private String descripcion;
    private int tiempo_promedio_navegacion_minutos;

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

    public int getTiempo_promedio_navegacion_minutos() {
        return tiempo_promedio_navegacion_minutos;
    }

    public void setTiempo_promedio_navegacion_minutos(int tiempo_promedio_navegacion_minutos) {
        this.tiempo_promedio_navegacion_minutos = tiempo_promedio_navegacion_minutos;
    }
}
