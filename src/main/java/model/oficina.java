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
    private municipio municipio;

    @OneToMany(mappedBy = "Cod_Oficina", cascade = CascadeType.ALL)
    private Set<area_Envio> area_Envios;

    @OneToMany(mappedBy = "Cod_Oficina", cascade = CascadeType.ALL)
    private Set<coche> coches;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Cod_Centro_Clas")
    private centro_De_Clasificacion centro_De_Clasificacion;

    public oficina () {
        // requerido por Hibernate
    }

    public oficina(String cod_Oficina, municipio nombre_Municipio, centro_De_Clasificacion cod_Centro_Clas) {
        Cod_Oficina = cod_Oficina;
        municipio = nombre_Municipio;
        centro_De_Clasificacion = cod_Centro_Clas;
    }

    //getters y setters

    public String getCod_Oficina() {
        return Cod_Oficina;
    }

    public void setCod_Oficina(String cod_Oficina) {
        Cod_Oficina = cod_Oficina;
    }

    public model.municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(model.municipio municipio) {
        this.municipio = municipio;
    }

    public model.centro_De_Clasificacion getCentro_De_Clasificacion() {
        return centro_De_Clasificacion;
    }

    public void setCentro_De_Clasificacion(model.centro_De_Clasificacion centro_De_Clasificacion) {
        this.centro_De_Clasificacion = centro_De_Clasificacion;
    }
}