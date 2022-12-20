package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "paquete")
public class paquete {
    @Id
    @Column(name = "ID_Paquete")
    private String ID_Paquete;
    @Column(name = "Altura", nullable = false)
    private int Altura;
    @Column(name = "Ancho", nullable = false)
    private int Ancho;
    @Column(name = "Peso", nullable = false)
    private int Peso;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Recogida")
    private recogida ID_Recogida;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usuario_Generico")
    private usuario_Generico ID_Usuario_Generico;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usuario_Generico_Emisor")
    private usuario_Generico ID_Usuario_Generico_Emisor;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Reparto")
    private reparto ID_Reparto;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Cartero")
    private cartero DNI_Cartero;
    @Column(name = "Comentario", nullable = false)
    private String Comentario;
    @Column(name = "Fecha", nullable = false)
    private Date Fecha;

    public paquete(String ID_Paquete, int altura, int ancho, int peso, recogida ID_Recogida, usuario_Generico ID_Usuario_Generico, usuario_Generico ID_Usuario_Generico_Emisor, reparto ID_Reparto, cartero DNI_Cartero, String comentario, Date fecha) {
        this.ID_Paquete = ID_Paquete;
        Altura = altura;
        Ancho = ancho;
        Peso = peso;
        this.ID_Recogida = ID_Recogida;
        this.ID_Usuario_Generico = ID_Usuario_Generico;
        this.ID_Usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
        this.ID_Reparto = ID_Reparto;
        this.DNI_Cartero = DNI_Cartero;
        Comentario = comentario;
        Fecha = fecha;
    }

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

    public recogida getID_Recogida() {
        return ID_Recogida;
    }

    public void setID_Recogida(recogida ID_Recogida) {
        this.ID_Recogida = ID_Recogida;
    }

    public usuario_Generico getID_Usuario_Generico() {
        return ID_Usuario_Generico;
    }

    public void setID_Usuario_Generico(usuario_Generico ID_Usuario_Generico) {
        this.ID_Usuario_Generico = ID_Usuario_Generico;
    }

    public usuario_Generico getID_Usuario_Generico_Emisor() {
        return ID_Usuario_Generico_Emisor;
    }

    public void setID_Usuario_Generico_Emisor(usuario_Generico ID_Usuario_Generico_Emisor) {
        this.ID_Usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
    }

    public reparto getID_Reparto() {
        return ID_Reparto;
    }

    public void setID_Reparto(reparto ID_Reparto) {
        this.ID_Reparto = ID_Reparto;
    }

    public cartero getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(cartero DNI_Cartero) {
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
}
