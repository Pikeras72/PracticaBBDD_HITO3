package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "recogida")
public class recogida {
    @Id
    @Column(name = "ID_Recogida")
    private int ID_Recogida;
    @Column(name = "Fecha_recogida", nullable = false)
    private Date Fecha_recogida;

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
    @ManyToOne(optional = false,cascade = {CascadeType.ALL})
    @JoinColumn(name = "cartero")
    private String DNI_Cartero;
    @ManyToOne(optional = false, cascade = {CascadeType.ALL})
    @JoinColumn(name = "usuarioVerificado")
    private String DNI_Usuario_Identificado;

    @OneToMany(mappedBy = "recogida", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    public recogida(int ID_Recogida, Date fecha_recogida, int num, int piso, char letra, int portal, String DNI_Cartero, String DNI_Usuario_Identificado, String nombre_Calle, String nombre_Municipio) {
        this.ID_Recogida = ID_Recogida;
        this.Fecha_recogida = fecha_recogida;
        this.Num = num;
        this.Piso = piso;
        this.Letra = letra;
        this.Portal = portal;
        this.DNI_Cartero = DNI_Cartero;
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
        this.Nombre_Calle = nombre_Calle;
        this.Nombre_Municipio = nombre_Municipio;
    }

    public recogida() {
        //requerido por Hibernate
    }

    //getters y setters

    public int getID_Recogida() {
        return ID_Recogida;
    }

    public void setID_Recogida(int ID_Recogida) {
        this.ID_Recogida = ID_Recogida;
    }

    public Date getFecha_recogida() {
        return Fecha_recogida;
    }

    public void setFecha_recogida(Date fecha_recogida) {
        Fecha_recogida = fecha_recogida;
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

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(String DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public String getDNI_Usuario_Identificado() {
        return DNI_Usuario_Identificado;
    }

    public void setDNI_Usuario_Identificado(String DNI_Usuario_Identificado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
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
