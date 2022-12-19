package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
@Entity
@Table(name = "turno")
public class turno {
    @Id
    @Column(name = "Jornada")
    private String Jornada;
    @Column(name = "Hora_inicio", nullable = false)
    private Time Hora_inicio;
    @Column(name = "Hora_fin", nullable = false)
    private Time Hora_fin;

    public turno(String jornada, Time hora_inicio, Time hora_fin) {
        Jornada = jornada;
        Hora_inicio = hora_inicio;
        Hora_fin = hora_fin;
    }

    public turno() {
        //requerido
    }

    //getters y setters

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String jornada) {
        Jornada = jornada;
    }

    public Time getHora_inicio() {
        return Hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        Hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return Hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        Hora_fin = hora_fin;
    }
}
