package model;

import javax.persistence.Query;
import java.util.List;

public class Main {

    public static void main (String [] args) {
        Controlador controlador = new Controlador();
        provincia provincia = controlador.createProvincia("Madrid");
        municipio municipio = controlador.createMunicipio("Madrid", provincia);
        calle calle = controlador.createCalle("Calle de Guzmán el Bueno", municipio);


        direccion direccion = controlador.createDireccion(32, 1, 'B', 0, calle);
        usuario_Identificado usuario_identificado = controlador.createUsuarioIdentificado("49841308F", "Pedro", "Alcocer Martín", "holasoypedro@gmail.com", null);


        direccion.getUsuarios_Identificados().add(usuario_identificado);
        usuario_identificado.getDireccion().add(direccion);

        controlador.getSession().beginTransaction();
        controlador.getSession().saveOrUpdate(usuario_identificado);
        controlador.getSession().saveOrUpdate(direccion);
        controlador.getSession().getTransaction().commit();

        System.out.println("Se ha creado un nuevo usuario_Identificado llamado: " + usuario_identificado.getNombre()+" "+usuario_identificado.getApellidos() + " cuyo DNI es " + usuario_identificado.getDNI_Usuario_Identificado() + " y vive en " + direccion.toString());

        Query query = controlador.getSession().createQuery("from usuario_Identificado ");
        List<usuario_Identificado> list = query.getResultList();
        System.out.println("USUARIOS:\n");
        for (usuario_Identificado usuario : list) {
            System.out.println("usuario_Identificado DNI: "+usuario.getDNI_Usuario_Identificado()+", llamado: "+usuario.getNombre()+" "+usuario.getApellidos()+". Mail: "+usuario.getMail());
        }

        Query query2 = controlador.getSession().createQuery("from direccion ");
        List<direccion> list2 = query2.getResultList();
        System.out.println("DIRECCIONES:\n");
        for (direccion direccion1 : list2) {
            System.out.println(direccion1.getCalle().getNombre_Calle()+" Municipio: "+direccion1.getCalle().getMunicipio()+" Num: "+direccion1.getNum()+" Letra: "+direccion1.getLetra()+" Portal: "+direccion1.getPortal()+" Piso: "+direccion1.getPiso());
        }

        controlador.getSession().close();
    }
}

