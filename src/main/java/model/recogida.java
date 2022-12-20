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

    @ManyToOne(optional = false,cascade = {CascadeType.ALL})
    @JoinColumn(name = "direccion")
    private direccion direccion;
    @ManyToOne(optional = false,cascade = {CascadeType.ALL})
    @JoinColumn(name = "cartero")
    private cartero DNI_Cartero;
    @ManyToOne(optional = false, cascade = {CascadeType.ALL})
    @JoinColumn(name = "usuarioVerificado")
    private usuario_Identificado DNI_Usuario_Identificado;

    @OneToMany(mappedBy = "recogida", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    public recogida(int ID_Recogida, Date fecha_recogida, model.direccion direccion, cartero DNI_Cartero, usuario_Identificado DNI_Usuario_Identificado) {
        this.ID_Recogida = ID_Recogida;
        Fecha_recogida = fecha_recogida;
        this.direccion = direccion;
        this.DNI_Cartero = DNI_Cartero;
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
    }

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

    public model.direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(model.direccion direccion) {
        this.direccion = direccion;
    }

    public cartero getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(cartero DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public usuario_Identificado getDNI_Usuario_Identificado() {
        return DNI_Usuario_Identificado;
    }

    public void setDNI_Usuario_Identificado(usuario_Identificado DNI_Usuario_Identificado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
    }
}
