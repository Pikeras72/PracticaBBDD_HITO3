package model;

import javax.persistence.*;

public class vive_En {
    @Id
    @JoinColumn(name = "DNI_Usuario_Identificado")
    private String DNI_Usuario_Identificado;

    @Id
    @JoinColumn(name = "Num")
    private int Num;

    @Id
    @JoinColumn(name = "Piso")
    private int Piso;

    @Id
    @JoinColumn(name = "Letra")
    private char Letra;

    @Id
    @JoinColumn(name = "Portal")
    private int Portal;

    @Id
    @JoinColumn(name = "Nombre_Calle")
    private String Nombre_Calle;

    @Id
    @JoinColumn(name = "Nombre_Municipio")
    private String Nombre_Municipio;

    public vive_En(String DNI_Usuario_Identificado, int num, int piso, char letra, int portal, String nombre_Calle, String nombre_Municipio) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
        this.Num = num;
        this.Piso = piso;
        this.Letra = letra;
        this.Portal = portal;
        this.Nombre_Calle = nombre_Calle;
        this.Nombre_Municipio = nombre_Municipio;
    }

    public String getDNI_Usuario_Identificado() {
        return DNI_Usuario_Identificado;
    }

    public void setDNI_Usuario_Identificado(String DNI_Usuario_Identificado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
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
