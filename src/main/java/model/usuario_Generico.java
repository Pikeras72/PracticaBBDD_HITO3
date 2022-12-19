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
    @JoinColumn(
            name = "Piso"
    )private int Piso;

    @JoinColumn(
            name = "Portal"
    )private int Portal;
    @JoinColumn(
            name = "Letra"
    )private char Letra;

    @JoinColumn(
            name = "Num"
    )private int Num;

    @JoinColumn(
            name = "Nombre_Calle"
    )private String Nombre_Calle;

    @JoinColumn(
            name = "Nombre_Municipio"
    )private String Nombre_Municipio;

    @OneToMany(mappedBy = "usuario_Generico", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    @OneToMany(mappedBy = "usuario_Generico", cascade = CascadeType.ALL)
    private Set<paquete> paquetes_Emisor;

    public usuario_Generico(int ID_Usuario_Generico, String nombre, String apellidos, int num, int piso, char letra, int portal, String nombre_Calle, String nombre_Municipio) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Num = num;
        this.Piso = piso;
        this.Letra = letra;
        this.Portal = portal;
        this.Nombre_Calle = nombre_Calle;
        this.Nombre_Municipio = nombre_Municipio;
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

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int piso) {
        Piso = piso;
    }

    public char getLetra() {
        return Letra;
    }

    public void setLetra(char letra) {
        Letra = letra;
    }

    public int getPortal() {
        return Portal;
    }

    public void setPortal(int portal) {
        Portal = portal;
    }

    public String getNombre_Calle() {
        return Nombre_Calle;
    }

    public void setNombre_Calle(String nombre_Calle) {
        Nombre_Calle = nombre_Calle;
    }

    public String getNombre_Municipio() {
        return Nombre_Municipio;
    }

    public void setNombre_Municipio(String nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }
}
