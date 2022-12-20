package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "centro_De_Clasificacion")
public class centro_De_Clasificacion {

    @Id
    @Column(name = "Cod_Centro_Clas")
    private int Cod_Centro_Clas;

    @Column(name = "Nombre_Centro_Clas", nullable = false)
    private String Nombre_Centro_Clas;

    @Column(name = "Capacidad_proces_paquetes", nullable = false)
    private int Capacidad_proces_paquetes;

    @Column(name = "Capacidad_proces_cartas", nullable = false)
    private int Capacidad_proces_cartas;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Municipio")
    private municipio Nombre_Municipio;

    @OneToMany(mappedBy = "centro_De_Clasificacion", cascade = CascadeType.ALL)
    private Set<oficina> oficinas;

    public centro_De_Clasificacion(int cod_Centro_Clas, String nombre_Centro_Clas, int capacidad_proces_paquetes, int capacidad_proces_cartas, municipio nombre_Municipio) {
        Cod_Centro_Clas = cod_Centro_Clas;
        Nombre_Centro_Clas = nombre_Centro_Clas;
        Capacidad_proces_paquetes = capacidad_proces_paquetes;
        Capacidad_proces_cartas = capacidad_proces_cartas;
        Nombre_Municipio = nombre_Municipio;
    }

    //getters y setters

    public int getCod_Centro_Clas() {
        return Cod_Centro_Clas;
    }

    public void setCod_Centro_Clas(int cod_Centro_Clas) {
        Cod_Centro_Clas = cod_Centro_Clas;
    }

    public String getNombre_Centro_Clas() {
        return Nombre_Centro_Clas;
    }

    public void setNombre_Centro_Clas(String nombre_Centro_Clas) {
        Nombre_Centro_Clas = nombre_Centro_Clas;
    }

    public int getCapacidad_proces_paquetes() {
        return Capacidad_proces_paquetes;
    }

    public void setCapacidad_proces_paquetes(int capacidad_proces_paquetes) {
        Capacidad_proces_paquetes = capacidad_proces_paquetes;
    }

    public int getCapacidad_proces_cartas() {
        return Capacidad_proces_cartas;
    }

    public void setCapacidad_proces_cartas(int capacidad_proces_cartas) {
        Capacidad_proces_cartas = capacidad_proces_cartas;
    }

    public String getNombre_Municipio() {
        return Nombre_Municipio;
    }

    public void setNombre_Municipio(String nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }
}
