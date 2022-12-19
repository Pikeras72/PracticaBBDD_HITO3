package model;

public class oficina {

    private String Cod_Oficina;
    private String  Nombre_Municipio;
    private int Cod_Centro_Clas;
    private int Num;
    private int Piso;
    private char Letra;
    private int Portal;
    private String Nombre_Calle;

    public oficina(String cod_Oficina, String nombre_Municipio, int cod_Centro_Clas, int num, int piso, char letra, int portal, String nombre_Calle) {
        Cod_Oficina = cod_Oficina;
        Nombre_Municipio = nombre_Municipio;
        Cod_Centro_Clas = cod_Centro_Clas;
        Num = num;
        Piso = piso;
        Letra = letra;
        Portal = portal;
        Nombre_Calle = nombre_Calle;
    }

    //getters y setters

    public String getCod_Oficina() {
        return Cod_Oficina;
    }

    public void setCod_Oficina(String cod_Oficina) {
        Cod_Oficina = cod_Oficina;
    }

    public String getNombre_Municipio() {
        return Nombre_Municipio;
    }

    public void setNombre_Municipio(String nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }

    public int getCod_Centro_Clas() {
        return Cod_Centro_Clas;
    }

    public void setCod_Centro_Clas(int cod_Centro_Clas) {
        Cod_Centro_Clas = cod_Centro_Clas;
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
}
