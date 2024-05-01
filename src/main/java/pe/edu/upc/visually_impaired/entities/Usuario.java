package pe.edu.upc.visually_impaired.entities;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "genero", nullable = false, length = 50)
    private String genero;
    @Column(name = "email", nullable = false, length = 250, unique = true) //unique=true
    private String email;
    @Column(name = "ultima_ubicacion", nullable = false, length = 500)
    private String ultima_ubicacion;
    @Column(name = "password", nullable = false, length = 250)
    private String password;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Tipos_de_usuario> roles;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, String genero, String email, String ultima_ubicacion, String password, Boolean enabled, List<Tipos_de_usuario> roles) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.email = email;
        this.ultima_ubicacion = ultima_ubicacion;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Tipos_de_usuario> getRoles() {
        return roles;
    }

    public void setRoles(List<Tipos_de_usuario> roles) {
        this.roles = roles;
    }
}
