package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "carta")
public class carta {

    @Id
    @Column(name = "ID_Carta")
    private String ID_Carta;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Cartero")
    private cartero DNI_Cartero;

    @Column(name = "Formato", nullable = false)
    private String Formato;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Reparto")
    private reparto ID_Reparto;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usuario_Generico")
    private usuario_Generico ID_Usuario_Generico;

    @Column(name = "Fecha")
    private Date Fecha;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usuario_Generico_Emisor")
    private usuario_Generico ID_Usuario_Generico_Emisor;

    public carta(String ID_Carta, cartero DNI_Cartero, String formato, reparto ID_Reparto, usuario_Generico ID_Usuario_Generico, Date fecha, usuario_Generico ID_Usuario_Generico_Emisor) {
        this.ID_Carta = ID_Carta;
        this.DNI_Cartero = DNI_Cartero;
        Formato = formato;
        this.ID_Reparto = ID_Reparto;
        this.ID_Usuario_Generico = ID_Usuario_Generico;
        Fecha = fecha;
        this.ID_Usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
    }

    public carta() {
        //requerido
    }

    //getters y setters

    public String getID_Carta() {
        return ID_Carta;
    }

    public void setID_Carta(String ID_Carta) {
        this.ID_Carta = ID_Carta;
    }

    public cartero getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(cartero DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String formato) {
        Formato = formato;
    }

    public reparto getID_Reparto() {
        return ID_Reparto;
    }

    public void setID_Reparto(reparto ID_Reparto) {
        this.ID_Reparto = ID_Reparto;
    }

    public usuario_Generico getID_Usuario_Generico() {
        return ID_Usuario_Generico;
    }

    public void setID_Usuario_Generico(usuario_Generico ID_Usuario_Generico) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public usuario_Generico getID_Usuario_Generico_Emisor() {
        return ID_Usuario_Generico_Emisor;
    }

    public void setID_Usuario_Generico_Emisor(usuario_Generico ID_Usuario_Generico_Emisor) {
        this.ID_Usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
    }
}
