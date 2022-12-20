package model;

import javax.persistence.*;

@Entity
@Table(name = "carta_Cert")
public class carta_Cert {

    @Id
    @Column(name = "ID_Carta")
    private String ID_carta_Cert;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Cartero")
    private cartero cartero;

    @Column(name = "Nivel_Urgencia", nullable = false)
    private int Nivel_Urgencia;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Reparto")
    private reparto reparto;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Usuario_Identificado")
    private usuario_Identificado usuario_Identificado;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Usuario_Identificado_Emisor")
    private usuario_Identificado usuario_Identificado_Emisor;

    public carta_Cert(String ID_carta_Cert, cartero DNI_Cartero, int nivel_Urgencia, reparto ID_Reparto, usuario_Identificado DNI_Usuario_Identificado, usuario_Identificado DNI_Usuario_Identificado_Emisor) {
        this.ID_carta_Cert = ID_carta_Cert;
        this.cartero = DNI_Cartero;
        Nivel_Urgencia = nivel_Urgencia;
        this.reparto = ID_Reparto;
        this.usuario_Identificado = DNI_Usuario_Identificado;
        this.usuario_Identificado_Emisor = DNI_Usuario_Identificado_Emisor;
    }

    public carta_Cert() {
        //requerido por Hibernate
    }

    //getters y setters

    public String getID_carta_Cert() {
        return ID_carta_Cert;
    }

    public void setID_carta_Cert(String ID_carta_Cert) {
        this.ID_carta_Cert = ID_carta_Cert;
    }

    public model.cartero getCartero() {
        return cartero;
    }

    public void setCartero(model.cartero cartero) {
        this.cartero = cartero;
    }

    public int getNivel_Urgencia() {
        return Nivel_Urgencia;
    }

    public void setNivel_Urgencia(int nivel_Urgencia) {
        Nivel_Urgencia = nivel_Urgencia;
    }

    public model.reparto getReparto() {
        return reparto;
    }

    public void setReparto(model.reparto reparto) {
        this.reparto = reparto;
    }

    public model.usuario_Identificado getUsuario_Identificado() {
        return usuario_Identificado;
    }

    public void setUsuario_Identificado(model.usuario_Identificado usuario_Identificado) {
        this.usuario_Identificado = usuario_Identificado;
    }

    public model.usuario_Identificado getUsuario_Identificado_Emisor() {
        return usuario_Identificado_Emisor;
    }

    public void setUsuario_Identificado_Emisor(model.usuario_Identificado usuario_Identificado_Emisor) {
        this.usuario_Identificado_Emisor = usuario_Identificado_Emisor;
    }
}
