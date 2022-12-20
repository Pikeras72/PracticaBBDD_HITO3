package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "usuario_Identificado")
public class usuario_Identificado {
    @Id
    @Column(name = "DNI_Usuario_Identificado", length = 10, nullable = false)
    private String DNI_Usuario_Identificado;
    @Column(name = "Nombre", nullable = false)
    private String Nombre;
    @Column(name = "Apellidos", nullable = false)
    private String Apellidos;
    @Column(name = "Mail", nullable = false)
    private String Mail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DNI_Usuario_Identificado_Autorizado")
    private usuario_Identificado usuario_Identificado;

    @OneToMany(mappedBy = "usuario_Identificado", cascade = CascadeType.ALL)
    private Set<usuario_Identificado> usuarios_Identificados;

    @OneToMany(mappedBy = "usuario_Identificado", cascade = CascadeType.ALL)
    private Set<recogida> recogidas;

    @OneToMany(mappedBy = "usuario_Identificado", cascade = CascadeType.ALL)
    private Set<carta_Cert> cartas_Cert;

    @OneToMany(mappedBy = "usuario_Identificado", cascade = CascadeType.ALL)
    private Set<carta_Cert> cartas_Cert_Emisor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "vive_En")
    private Set<direccion> direccion;

    public usuario_Identificado(String DNI_Usuario_Identificado, String nombre, String apellidos, String mail, usuario_Identificado usuario_identificado_Autorizado) {
        this.DNI_Usuario_Identificado = DNI_Usuario_Identificado;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Mail = mail;
        this.usuario_Identificado = usuario_identificado_Autorizado;
        this.direccion = new HashSet<>();
    }

    public usuario_Identificado() {
        //requerido
    }

    //getters y setters


    public Set<model.direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(Set<model.direccion> direccion) {
        this.direccion = direccion;
    }

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

    public model.usuario_Identificado getUsuario_Identificado() {
        return usuario_Identificado;
    }

    public void setUsuario_Identificado(model.usuario_Identificado usuario_Identificado) {
        this.usuario_Identificado = usuario_Identificado;
    }
}
