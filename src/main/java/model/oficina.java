package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "oficina")
public class oficina {

    @Id
    @Column(name = "id")
    private String Cod_Oficina;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Municipio")
    private municipio Nombre_Municipio;

    @OneToMany(mappedBy = "Cod_Oficina", cascade = CascadeType.ALL)
    private Set<area_Envio> area_Envios;

    @OneToMany(mappedBy = "Cod_Oficina", cascade = CascadeType.ALL)
    private Set<coche> coches;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Cod_Centro_Clas")
    private centro_De_Clasificacion Cod_Centro_Clas;

    public oficina () {
        // requerido por Hibernate
    }

    public oficina(String cod_Oficina, municipio nombre_Municipio, centro_De_Clasificacion cod_Centro_Clas) {
        Cod_Oficina = cod_Oficina;
        Nombre_Municipio = nombre_Municipio;
        Cod_Centro_Clas = cod_Centro_Clas;
    }

    //getters y setters

    public String getCod_Oficina() {
        return Cod_Oficina;
    }

    public void setCod_Oficina(String cod_Oficina) {
        Cod_Oficina = cod_Oficina;
    }

    public municipio getNombre_Municipio() {
        return Nombre_Municipio;
    }

    public void setNombre_Municipio(municipio nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }

    public centro_De_Clasificacion getCod_Centro_Clas() {
        return Cod_Centro_Clas;
    }

    public void setCod_Centro_Clas(centro_De_Clasificacion cod_Centro_Clas) {
        Cod_Centro_Clas = cod_Centro_Clas;
    }
}