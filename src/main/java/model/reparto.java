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
    private cartero DNI_Cartero;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Matricula")
    private coche Matricula;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Ruta")
    private ruta ID_Ruta;

    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL)
    private Set<carta_Cert> cartas_Cert;

    @OneToMany(mappedBy = "reparto", cascade = CascadeType.ALL)
    private Set<paquete> paquetes;

    public reparto(int ID_Reparto, Date fecha_Creacion, cartero DNI_Cartero, coche matricula, ruta ID_Ruta) {
        this.ID_Reparto = ID_Reparto;
        Fecha_Creacion = fecha_Creacion;
        this.DNI_Cartero = DNI_Cartero;
        Matricula = matricula;
        this.ID_Ruta = ID_Ruta;
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

    public cartero getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(cartero DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public coche getMatricula() {
        return Matricula;
    }

    public void setMatricula(coche matricula) {
        Matricula = matricula;
    }

    public ruta getID_Ruta() {
        return ID_Ruta;
    }

    public void setID_Ruta(ruta ID_Ruta) {
        this.ID_Ruta = ID_Ruta;
    }
}
