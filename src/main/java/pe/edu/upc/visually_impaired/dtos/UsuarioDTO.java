package pe.edu.upc.visually_impaired.dtos;
import pe.edu.upc.visually_impaired.entities.Tipos_de_usuario;

public class UsuarioDTO {
    private int idUsuario;

    private String nombre;
    private String apellido;
    private String email;
    private String ultima_ubicacion;
    private String password;
    private Tipos_de_usuario tipos_usuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUltima_ubicacion() {
        return ultima_ubicacion;
    }

    public void setUltima_ubicacion(String ultima_ubicacion) {
        this.ultima_ubicacion = ultima_ubicacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tipos_de_usuario getTipos_usuario() {
        return tipos_usuario;
    }

    public void setTipos_usuario(Tipos_de_usuario tipos_usuario) {
        this.tipos_usuario = tipos_usuario;
    }
}
