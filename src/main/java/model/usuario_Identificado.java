package model;

public class usuario_Identificado {

    private String DNI_Usuario_Identificado;
    private String Nombre;
    private String Apellidos;
    private String Mail;
    private String DNI_Usuario_Identificado_Autorizado;

    public usuario_Identificado(String DNI_Usuario_Identificado, String nombre, String apellidos, String mail, String DNI_Usuario_Identificado_Autorizado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
        Nombre = nombre;
        Apellidos = apellidos;
        Mail = mail;
        this.DNI_Usuario_Identificado_Autorizado = DNI_Usuario_Identificado_Autorizado;
    }

    //getters y setters

    public String getDNI_Usuario_Identificado() {
        return DNI_Usuario_Identificado;
    }

    public void setDNI_Usuario_Identificado(String DNI_Usuario_Identificado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getDNI_Usuario_Identificado_Autorizado() {
        return DNI_Usuario_Identificado_Autorizado;
    }

    public void setDNI_Usuario_Identificado_Autorizado(String DNI_Usuario_Identificado_Autorizado) {
        this.DNI_Usuario_Identificado_Autorizado = DNI_Usuario_Identificado_Autorizado;
    }
}
