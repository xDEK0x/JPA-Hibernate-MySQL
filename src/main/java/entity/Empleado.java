package entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity // !Indica que es una entidad JPA
@Table(name = "EMPLEADO") // !Define el nombre de la tabla en la base de datos
public class Empleado implements Serializable {

    private static final long serialVersionUID = 8207135004598414909L;

    @Id // !Indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // !Genera automáticamente valores para la clave primaria
    @Column(name = "ID_EMPLEADO") // !Define el nombre de la columna en la tabla
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DEPARTAMENTO")
    private String departamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}

