package model;
public class coche {

    private String Matricula;
    private float Capacidad;
    private String Cod_Oficina;

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
