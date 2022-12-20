package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "calle")
public class calle implements Serializable {

    @Id
    @Column(name = "Nombre_Calle", length = 50)
    private String Nombre_Calle;

    @Id
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Municipio")
    private municipio municipio;

    @OneToMany(mappedBy = "calle", cascade = CascadeType.ALL)
    private Set<segmento_De_Calle> segmentos_De_Calle;

    @OneToMany(mappedBy = "calle", cascade = CascadeType.ALL)
    private Set<direccion> direcciones;

    public calle(){
        // requerido por Hibernate
    }

    public calle(String nombre_Calle, municipio nombre_Municipio) {
        this.Nombre_Calle = nombre_Calle;
        this.municipio = nombre_Municipio;
    }

    //getters y setters

    public String getNombre_Calle() {
        return Nombre_Calle;
    }
    public void setNombre_Calle(String nombre_Calle) {
        Nombre_Calle = nombre_Calle;
    }

    public model.municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(model.municipio municipio) {
        this.municipio = municipio;
    }
}
