package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provincia")
public class provincia {

    @Id
    @Column(name = "Nombre_Provincia")
    private String Nombre_Provincia;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private Set<municipio> municipios;

    public provincia(String nombre_Provincia) {
        Nombre_Provincia = nombre_Provincia;
    }

    public provincia() {
        // requerido por Hibernate
    }

    //getters y setters

    public String getNombre_Provincia() {
        return Nombre_Provincia;
    }
    public void setNombre_Provincia(String nombre_Provincia) {
        Nombre_Provincia = nombre_Provincia;
    }

}
