package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "direccion")
public class direccion implements Serializable {
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
            @JoinColumn(name = "Nombre_Municipio"),
            @JoinColumn(name = "Nombre_Calle")
    })
    private calle calle;

    @ManyToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
    private Set<usuario_Identificado> usuarios_Identificados;

    @OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
    private Set<recogida> recogidas;

    public direccion(int num, int piso, char letra, int portal, calle calle) {
        this.Num = num;
        this.Piso = piso;
        this.Letra = letra;
        this.Portal = portal;
        this.calle = calle;
        this.usuarios_Identificados = new HashSet<>();
    }

    public direccion() {
        //requerido
    }

    //getters y setters

    public Set<usuario_Identificado> getUsuarios_Identificados() {
        return usuarios_Identificados;
    }

    public void setUsuarios_Identificados(Set<usuario_Identificado> usuarios_Identificados) {
        this.usuarios_Identificados = usuarios_Identificados;
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
        this.Portal = portal;
    }

    public model.calle getCalle() {
        return calle;
    }

    public void setCalle(model.calle calle) {
        this.calle = calle;
    }
}
