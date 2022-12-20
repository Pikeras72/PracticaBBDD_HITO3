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
    private recogida recogida;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usuario_Generico")
    private usuario_Generico usuario_Generico;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usuario_Generico_Emisor")
    private usuario_Generico usuario_Generico_Emisor;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Reparto")
    private reparto reparto;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Cartero")
    private cartero cartero;
    @Column(name = "Comentario", nullable = false)
    private String Comentario;
    @Column(name = "Fecha", nullable = false)
    private Date Fecha;

    public paquete(String ID_Paquete, int altura, int ancho, int peso, recogida ID_Recogida, usuario_Generico ID_Usuario_Generico, usuario_Generico ID_Usuario_Generico_Emisor, reparto ID_Reparto, cartero DNI_Cartero, String comentario, Date fecha) {
        this.ID_Paquete = ID_Paquete;
        Altura = altura;
        Ancho = ancho;
        Peso = peso;
        this.recogida = ID_Recogida;
        this.usuario_Generico = ID_Usuario_Generico;
        this.usuario_Generico_Emisor = ID_Usuario_Generico_Emisor;
        this.reparto = ID_Reparto;
        this.cartero = DNI_Cartero;
        Comentario = comentario;
        Fecha = fecha;
    }

    public paquete() {
        //requerido
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

    public model.recogida getRecogida() {
        return recogida;
    }

    public void setRecogida(model.recogida recogida) {
        this.recogida = recogida;
    }

    public model.usuario_Generico getUsuario_Generico() {
        return usuario_Generico;
    }

    public void setUsuario_Generico(model.usuario_Generico usuario_Generico) {
        this.usuario_Generico = usuario_Generico;
    }

    public model.usuario_Generico getUsuario_Generico_Emisor() {
        return usuario_Generico_Emisor;
    }

    public void setUsuario_Generico_Emisor(model.usuario_Generico usuario_Generico_Emisor) {
        this.usuario_Generico_Emisor = usuario_Generico_Emisor;
    }

    public model.reparto getReparto() {
        return reparto;
    }

    public void setReparto(model.reparto reparto) {
        this.reparto = reparto;
    }

    public model.cartero getCartero() {
        return cartero;
    }

    public void setCartero(model.cartero cartero) {
        this.cartero = cartero;
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
