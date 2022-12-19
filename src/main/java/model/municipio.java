package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "municipio")
public class municipio {

    @Id
    @Column(name = "Nombre_Municipio")
    private String Nombre_Municipio;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Provincia")
    private String Nombre_Provincia;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private Set<calle> calles;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private Set<centro_De_Clasificacion> centros_De_Clasificacion;

    public municipio () {
        // requerido por Hibernate
    }

    public municipio(String nombre_Municipio, String nombre_Provincia) {
        this.Nombre_Municipio = nombre_Municipio;
        this.Nombre_Provincia = nombre_Provincia;
    }

    //getters y setters

    public String getNombre_Municipio() {
        return Nombre_Municipio;
    }

    public void setNombre_Municipio(String nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }

    public String getNombre_Provincia() {
        return Nombre_Provincia;
    }

    public void setNombre_Provincia(String nombre_Provincia) {
        Nombre_Provincia = nombre_Provincia;
    }
}
