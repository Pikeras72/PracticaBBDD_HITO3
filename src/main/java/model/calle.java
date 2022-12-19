package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "calle")
public class calle {

    @Id
    @Column(name = "Nombre_Calle")
    private String Nombre_Calle;

    @Id
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Municipio")
    private municipio Nombre_Municipio;

    @OneToMany(mappedBy = "calle", cascade = CascadeType.ALL)
    private Set<segmento_De_Calle> segmento_De_Calle;

    @OneToMany(mappedBy = "calle", cascade = CascadeType.ALL)
    private Set<direccion> direccion;

    public calle(){
        // requerido por Hibernate
    }

    public calle(String nombre_Calle, municipio nombre_Municipio) {
        Nombre_Calle = nombre_Calle;
        Nombre_Municipio = nombre_Municipio;
    }

    //getters y setters

    public String getNombre_Calle() {
        return Nombre_Calle;
    }
    public void setNombre_Calle(String nombre_Calle) {
        Nombre_Calle = nombre_Calle;
    }

    public municipio getNombre_Municipio() {
        return Nombre_Municipio;
    }
    public void setNombre_Municipio(municipio nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }
}
