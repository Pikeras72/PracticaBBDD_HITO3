package model;

public class direccion {

    private int Num;
    private int Piso;
    private char Letra;
    private int portal;
    private String Nombre_Calle;
    private String Nombre_Municipio;

    public direccion(int num, int piso, char letra, int portal, String nombre_Calle, String nombre_Municipio) {
        Num = num;
        Piso = piso;
        Letra = letra;
        this.portal = portal;
        Nombre_Calle = nombre_Calle;
        Nombre_Municipio = nombre_Municipio;
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
        return portal;
    }

    public void setPortal(int portal) {
        this.portal = portal;
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
