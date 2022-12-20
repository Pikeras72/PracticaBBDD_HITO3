package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "coche")
public class coche {

    @Id
    @Column(name = "Matricula")
    private String Matricula;

    @Column(name = "Capacidad", nullable = false)
    private float Capacidad;

    @OneToMany(mappedBy = "coche", cascade = CascadeType.ALL)
    private Set<reparto> repartos;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Cod_Oficina")
    private oficina Cod_Oficina;

    public coche(String matricula, float capacidad, oficina cod_Oficina) {
        Matricula = matricula;
        Capacidad = capacidad;
        Cod_Oficina = cod_Oficina;
    }

    public coche() {
        //requerido
    }

    //getters y setters


    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public oficina getCod_Oficina() {
        return Cod_Oficina;
    }

    public void setCod_Oficina(oficina cod_Oficina) {
        Cod_Oficina = cod_Oficina;
    }

    public float getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(float capacidad) {
        Capacidad = capacidad;
    }
}
