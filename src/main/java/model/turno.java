package model;

import java.sql.Time;

public class turno {

    private String Jornada;
    private Time Hora_inicio;
    private Time Hora_fin;

    public turno(String jornada, Time hora_inicio, Time hora_fin) {
        Jornada = jornada;
        Hora_inicio = hora_inicio;
        Hora_fin = hora_fin;
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
