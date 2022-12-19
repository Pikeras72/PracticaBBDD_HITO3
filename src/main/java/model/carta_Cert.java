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
    private cartero DNI_Cartero;

    @Column(name = "Nivel_Urgencia", nullable = false)
    private int Nivel_Urgencia;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Reparto")
    private reparto ID_Reparto;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Usuario_Identificado")
    private usuario_Identificado DNI_Usuario_Identificado;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Usuario_Identificado_Emisor")
    private usuario_Identificado DNI_Usuario_Identificado_Emisor;

    public carta_Cert(String ID_carta_Cert, cartero DNI_Cartero, int nivel_Urgencia, reparto ID_Reparto, usuario_Identificado DNI_Usuario_Identificado, usuario_Identificado DNI_Usuario_Identificado_Emisor) {
        this.ID_carta_Cert = ID_carta_Cert;
        this.DNI_Cartero = DNI_Cartero;
        Nivel_Urgencia = nivel_Urgencia;
        this.ID_Reparto = ID_Reparto;
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
        this.DNI_Usuario_Identificado_Emisor = DNI_Usuario_Identificado_Emisor;
    }

    //getters y setters

    public String getID_carta_Cert() {
        return ID_carta_Cert;
    }

    public void setID_carta_Cert(String ID_carta_Cert) {
        this.ID_carta_Cert = ID_carta_Cert;
    }

    public cartero getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(cartero DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public int getNivel_Urgencia() {
        return Nivel_Urgencia;
    }

    public void setNivel_Urgencia(int nivel_Urgencia) {
        Nivel_Urgencia = nivel_Urgencia;
    }

    public reparto getID_Reparto() {
        return ID_Reparto;
    }

    public void setID_Reparto(reparto ID_Reparto) {
        this.ID_Reparto = ID_Reparto;
    }

    public usuario_Identificado getDNI_Usuario_Identificado() {
        return DNI_Usuario_Identificado;
    }

    public void setDNI_Usuario_Identificado(usuario_Identificado DNI_Usuario_Identificado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
    }

    public usuario_Identificado getDNI_Usuario_Identificado_Emisor() {
        return DNI_Usuario_Identificado_Emisor;
    }

    public void setDNI_Usuario_Identificado_Emisor(usuario_Identificado DNI_Usuario_Identificado_Emisor) {
        this.DNI_Usuario_Identificado_Emisor = DNI_Usuario_Identificado_Emisor;
    }
}
