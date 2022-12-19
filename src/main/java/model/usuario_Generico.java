package model;

public class usuario_Generico {

    private int ID_Usuario_Generico;
    private String Nombre;
    private String Apellidos;
    private int Num;
    private int Piso;
    private char Letra;
    private int Portal;
    private String Nombre_Calle;
    private String Nombre_Municipio;

    public usuario_Generico(int ID_Usuario_Generico, String nombre, String apellidos, int num, int piso, char letra, int portal, String nombre_Calle, String nombre_Municipio) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
        Nombre = nombre;
        Apellidos = apellidos;
        Num = num;
        Piso = piso;
        Letra = letra;
        Portal = portal;
        Nombre_Calle = nombre_Calle;
        Nombre_Municipio = nombre_Municipio;
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
