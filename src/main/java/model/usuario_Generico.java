package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usuario_Generico")
public class usuario_Generico {
    @Id
    @Column(name = "ID_Usuario_Generico")
    private int ID_Usuario_Generico;
    @Column(name = "Nombre", nullable = false)
    private String Nombre;
    @Column(name = "Apellidos", nullable = false)
    private String Apellidos;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion")
    private direccion direccion;

    @OneToMany(mappedBy = "usuario_Generico", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    @OneToMany(mappedBy = "usuario_Generico", cascade = CascadeType.ALL)
    private Set<paquete> paquetes_Emisor;

    public usuario_Generico(int ID_Usuario_Generico, String nombre, String apellidos, int num, int piso, char letra, int portal, String nombre_Calle, String nombre_Municipio) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
    }

    public usuario_Generico() {
        //requerido
    }

    //getters y setters

    public int getID_Usuario_Generico() {
        return ID_Usuario_Generico;
    }

    public void setID_Usuario_Generico(int ID_Usuario_Generico) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
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
