package model;

import java.util.Date;

public class reparto {

    private int ID_Reparto;
    private Date Fecha_Creacion;
    private String DNI_Cartero;
    private String Matricula;
    private int ID_Ruta;

    public reparto(int ID_Reparto, Date fecha_Creacion, String DNI_Cartero, String matricula, int ID_Ruta) {
        this.ID_Reparto = ID_Reparto;
        Fecha_Creacion = fecha_Creacion;
        this.DNI_Cartero = DNI_Cartero;
        Matricula = matricula;
        this.ID_Ruta = ID_Ruta;
    }

    //getters y setters

    public int getID_Reparto() {
        return ID_Reparto;
    }

    public void setID_Reparto(int ID_Reparto) {
        this.ID_Reparto = ID_Reparto;
    }

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(String DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public int getID_Ruta() {
        return ID_Ruta;
    }

    public void setID_Ruta(int ID_Ruta) {
        this.ID_Ruta = ID_Ruta;
    }
}
