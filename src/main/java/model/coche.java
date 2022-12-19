package model;

import javax.persistence.*;
import java.util.Set;

public class coche {

    @Id
    @Column(name = "Matricula")
    private String Matricula;

    @OneToMany(mappedBy = "coche", cascade = CascadeType.ALL)
    private Set<reparto> repartos;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Cod_Oficina")
    private String Cod_Oficina;

    @Column(name = "Capacidad", nullable = false)
    private float Capacidad;

    public coche(String matricula, float capacidad, String cod_Oficina) {
        Matricula = matricula;
        Capacidad = capacidad;
        Cod_Oficina = cod_Oficina;
    }

    //getters y setters

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public float getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(float capacidad) {
        Capacidad = capacidad;
    }

    public String getCod_Oficina() {
        return Cod_Oficina;
    }

    public void setCod_Oficina(String cod_Oficina) {
        Cod_Oficina = cod_Oficina;
    }
}
