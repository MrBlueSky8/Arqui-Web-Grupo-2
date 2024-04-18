package pe.edu.upc.visually_impaired.dtos;

public class CantidadporGeneroDTO {
    private String Genero;
    private int Cantidad_Usuarios;

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getCantidad_Usuarios() {
        return Cantidad_Usuarios;
    }

    public void setCantidad_Usuarios(int cantidad_Usuarios) {
        Cantidad_Usuarios = cantidad_Usuarios;
    }
}
