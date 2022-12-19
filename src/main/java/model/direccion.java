package model;

import javax.persistence.*;
import java.util.Set;

public class direccion {

    @Id
    @Column(name = "Num")
    private int Num;

    @Id
    @Column(name = "Piso")
    private int Piso;

    @Id
    @Column(name = "Letra")
    private char Letra;

    @Id
    @Column(name = "Portal")
    private int Portal;

    @Id
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Calle")
    @JoinColumn(name = "Nombre_Municipio")
    private String Nombre_Calle;

    @Id
    @Column(name = "Nombre_Municipio")
    private String Nombre_Municipio;

    @ManyToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
    private Set<usuario_Identificado> usuarios_identificados;

    @OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
    private Set<recogida> recogidas;

    public direccion(int num, int piso, char letra, int portal, String nombre_Calle, String nombre_Municipio) {
        this.Num = num;
        this.Piso = piso;
        this.Letra = letra;
        this.Portal = portal;
        this.Nombre_Calle = nombre_Calle;
        this.Nombre_Municipio = nombre_Municipio;
    }

    //getters y setters

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
        this.Portal = portal;
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
