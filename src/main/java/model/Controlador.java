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

    public usuario_Identificado createUsuarioIdentificado(String DNI_Usuario_Identificado, String Nombre, String Apellidos, String Mail,usuario_Identificado usuario_identificado){
        usuario_Identificado usuarioIdentificado = new usuario_Identificado(DNI_Usuario_Identificado,Nombre,Apellidos,Mail,usuario_identificado);
        this.session.beginTransaction();
        this.session.saveOrUpdate(usuarioIdentificado);
        this.session.getTransaction().commit();
        return usuarioIdentificado;
    }

    public direccion createDireccion(int Num, int Piso, char Letra, int Portal, calle Nombre_Calle){
        direccion direccion = new direccion(Num,Piso,Letra,Portal,Nombre_Calle);
        this.session.beginTransaction();
        this.session.saveOrUpdate(direccion);
        this.session.getTransaction().commit();
        return direccion;
    }

    public calle createCalle(String Nombre_Calle, municipio Nombre_Municipio) {
        calle calle = new calle(Nombre_Calle,Nombre_Municipio);
        this.session.beginTransaction();
        this.session.saveOrUpdate(calle);
        this.session.getTransaction().commit();
        return calle;
    }

    public municipio createMunicipio(String Nombre_Municipio, provincia Nombre_Provincia) {
        municipio municipio = new municipio(Nombre_Municipio,Nombre_Provincia);
        this.session.beginTransaction();
        this.session.saveOrUpdate(municipio);
        this.session.getTransaction().commit();
        return municipio;
    }

    public provincia createProvincia(String Nombre_Provincia) {
        provincia provincia = new provincia(Nombre_Provincia);
        this.session.beginTransaction();
        this.session.saveOrUpdate(provincia);
        this.session.getTransaction().commit();
        return provincia;
    }

    public Session getSession() {
        return session;
    }
}
