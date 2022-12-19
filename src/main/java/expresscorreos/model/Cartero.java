package expresscorreos.model;

public class Cartero {
    private String DNI_Cartero;
    private String nombre;
    private String apellidos;

    public Cartero(String DNI_Cartero, String nombre, String apellidos) {
        this.DNI_Cartero = DNI_Cartero;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI_Cartero() {
        return DNI_Cartero;
    }

    public void setDNI_Cartero(String DNI_Cartero) {
        this.DNI_Cartero = DNI_Cartero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cartero{" +
                "DNI_Cartero='" + DNI_Cartero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
