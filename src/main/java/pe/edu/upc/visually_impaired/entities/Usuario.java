package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "email", nullable = false, length = 250)
    private String email;
    @Column(name = "ultima_ubicacion", nullable = false, length = 500)
    private String ultima_ubicacion;
    @Column(name = "password", nullable = false, length = 250)
    private String password;
    @ManyToOne
    @JoinColumn(name = "tipo_usuario_id")
    private Tipos_de_usuario tipos_usuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, String email, String ultima_ubicacion, String password, Tipos_de_usuario tipos_usuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ultima_ubicacion = ultima_ubicacion;
        this.password = password;
        this.tipos_usuario = tipos_usuario;
    }

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
