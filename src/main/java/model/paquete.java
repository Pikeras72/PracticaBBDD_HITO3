package model;

import java.util.Date;

public class paquete {

    private String ID_Paquete;
    private int Altura;
    private int Ancho;
    private int Peso;
    private int ID_Recogida;
    private int ID_Usuario_Generico;
    private int ID_Reparto;
    private String DNI_Cartero;
    private String Comentario;
    private Date Fecha;
    private int ID_Usuario_Generico_Emisor;

    public paquete(String ID_Paquete, int altura, int ancho, int peso, int ID_Recogida, int ID_Usuario_Generico, int ID_Reparto, String DNI_Cartero, String comentario, Date fecha, int ID_Usuario_Generico_Emisor) {
        this.ID_Paquete = ID_Paquete;
        Altura = altura;
        Ancho = ancho;
        Peso = peso;
        this.ID_Recogida = ID_Recogida;
        this.ID_Usuario_Generico = ID_Usuario_Generico;
        this.ID_Reparto = ID_Reparto;
        this.DNI_Cartero = DNI_Cartero;
        Comentario = comentario;
        Fecha = fecha;
        this.ID_Usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
    }

    //getters y setters

    public String getID_Paquete() {
        return ID_Paquete;
    }

    public void setID_Paquete(String ID_Paquete) {
        this.ID_Paquete = ID_Paquete;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public int getID_Recogida() {
        return ID_Recogida;
    }

    public void setID_Recogida(int ID_Recogida) {
        this.ID_Recogida = ID_Recogida;
    }

    public int getID_Usuario_Generico() {
        return ID_Usuario_Generico;
    }

    public void setID_Usuario_Generico(int ID_Usuario_Generico) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
    }

    public int getID_Reparto() {
        return ID_Reparto;
    }

    public void setID_Reparto(int ID_Reparto) {
        this.ID_Reparto = ID_Reparto;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(String DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getID_Usuario_Generico_Emisor() {
        return ID_Usuario_Generico_Emisor;
    }

    public void setID_Usuario_Generico_Emisor(int ID_Usuario_Generico_Emisor) {
        this.ID_Usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
    }
}
