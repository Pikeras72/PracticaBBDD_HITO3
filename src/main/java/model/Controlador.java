package model;

import com.sun.xml.bind.v2.model.core.ID;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.SQLException;

public class Controlador {
    private final Session session;

    public Controlador() { // Creación de la factoría
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        this.session = sessionFactory.openSession();
    }

    public usuario_Identificado createUsuarioIdentificado(String DNI_Usuario_Identificado, String Nombre, String Apellidos, String Mail, String DNI_Usuario_Identificado_Autorizado){
        usuario_Identificado usuarioIdentificado = new usuario_Identificado(DNI_Usuario_Identificado,Nombre,Apellidos,Mail,DNI_Usuario_Identificado_Autorizado);
        this.session.beginTransaction();
        this.session.save(usuarioIdentificado);
        this.session.getTransaction().commit();
        return usuarioIdentificado;
    }

    public direccion createDireccion(int Num, int Piso, char Letra, int Portal, String Nombre_Calle, String Nombre_Municipio){
        direccion direccion = new direccion(Num,Piso,Letra,Portal,Nombre_Calle,Nombre_Municipio);
        this.session.beginTransaction();
        this.session.save(direccion);
        this.session.getTransaction().commit();
        return direccion;
    }

    public calle createCalle(String Nombre_Calle, String Nombre_Municipio) {
        calle calle = new calle(Nombre_Calle,Nombre_Municipio);
        this.session.beginTransaction();
        this.session.save(calle);
        this.session.getTransaction().commit();
        return calle;
    }

    public municipio createMunicipio(String Nombre_Municipio, String Nombre_Provincia) {
        municipio municipio = new municipio(Nombre_Municipio,Nombre_Provincia);
        this.session.beginTransaction();
        this.session.save(municipio);
        this.session.getTransaction().commit();
        return municipio;
    }

    public provincia createProvincia(String Nombre_Provincia) {
        provincia provincia = new provincia(Nombre_Provincia);
        this.session.beginTransaction();
        this.session.save(provincia);
        this.session.getTransaction().commit();
        return provincia;
    }

    public Session getSession() {
        return session;
    }
}
