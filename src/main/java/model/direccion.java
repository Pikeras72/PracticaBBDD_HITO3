package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "direccion")
public class direccion {

    @Id
    @Column(name = "Num")
    private int Num;


    @Id
    @Column(name = "Piso")
    private int Piso;

    @Id
    @Column(name = "Letra")
    private char Letra;

    @Id
    @Column(name = "Portal")
    private int Portal;

    @Id
    @ManyToOne(optional = false,cascade = {CascadeType.ALL})
    @JoinColumns({
            @JoinColumn(name = "Nombre_Calle"),
            @JoinColumn(name = "Nombre_Municipio")
    })
    private calle Nombre_Calle;

    @ManyToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
    private Set<usuario_Identificado> usuarios_identificados;

    @OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
    private Set<recogida> recogidas;

    public direccion(int num, int piso, char letra, int portal, calle nombre_Calle) {
        this.Num = num;
        this.Piso = piso;
        this.Letra = letra;
        this.Portal = portal;
        this.Nombre_Calle = nombre_Calle;
    }

    //getters y setters

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
        this.Portal = portal;
    }

    public calle getNombre_Calle() {
        return Nombre_Calle;
    }

    public void setNombre_Calle(calle nombre_Calle) {
        Nombre_Calle = nombre_Calle;
    }

}
