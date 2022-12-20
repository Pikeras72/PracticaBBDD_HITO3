package model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reparto")
public class reparto {

    @Id
    @Column(name = "ID_Reparto")
    private int ID_Reparto;

    @Column(name = "Fecha_Creacion", nullable = false)
    private Date Fecha_Creacion;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Cartero")
    private cartero cartero;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula")
    private coche coche;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Ruta")
    private ruta ruta;

    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL)
    private Set<carta_Cert> cartas_Cert;

    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    public reparto(int ID_Reparto, Date fecha_Creacion, cartero DNI_Cartero, coche matricula, ruta ID_Ruta) {
        this.ID_Reparto = ID_Reparto;
        this.Fecha_Creacion = fecha_Creacion;
        this.cartero = DNI_Cartero;
        this.coche = matricula;
        this.ruta = ID_Ruta;
    }

    public reparto() {
        //requerido
    }

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

    public model.cartero getCartero() {
        return cartero;
    }

    public void setCartero(model.cartero cartero) {
        this.cartero = cartero;
    }

    public model.ruta getRuta() {
        return ruta;
    }

    public void setRuta(model.ruta ruta) {
        this.ruta = ruta;
    }

    public model.coche getCoche() {
        return coche;
    }

    public void setCoche(model.coche coche) {
        this.coche = coche;
    }
}
