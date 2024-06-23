package pe.edu.upc.visually_impaired.dtos;

public class CantidadRutasXPeriodoDTO {
    private String periodo;
    private int cantidad;

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
