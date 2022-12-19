package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cartero")
public class cartero {

    @Id
    @Column(name = "DNI_Cartero")
    private String DNI_Cartero;

    @Column(name = "Nombre", nullable = false)
    private String Nombre;

    @Column(name = "Apellidos", nullable = false)
    private String Apellidos;

    @OneToMany(mappedBy = "cartero", cascade = CascadeType.ALL)
    private Set<carta> cartas;

    @OneToMany(mappedBy = "cartero", cascade = CascadeType.ALL)
    private Set<carta_Cert> carta_Certs;

    @OneToMany(mappedBy = "cartero", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    @OneToMany(mappedBy = "cartero", cascade = CascadeType.ALL)
    private Set<recogida> recogidas;

    @OneToMany(mappedBy = "cartero", cascade = CascadeType.ALL)
    private Set<reparto> repartos;

    public cartero(String DNI_Cartero, String nombre, String apellidos) {
        this.DNI_Cartero = DNI_Cartero;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public cartero() {
        //requerido
    }

    //getters y setters

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(String DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
}
