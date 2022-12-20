package model;

public class Main {

    public static void main (String [] args) {
        Controlador controlador = new Controlador();
        provincia provincia = controlador.createProvincia("Madrid");
        municipio municipio = controlador.createMunicipio("Madrid", provincia);
        calle calle = controlador.createCalle("Calle de Guzmán el Bueno", municipio);
        direccion direccion = controlador.createDireccion(32, 1, 'B', 0, calle);
        usuario_Identificado usuario_identificado = controlador.createUsuarioIdentificado("49841308F", "Pedro", "Alcocer Martín", "holasoypedro@gmail.com");
        System.out.println("Se ha creado un nuevo usuario_Identificado llamado: " + usuario_identificado.getNombre()+" "+usuario_identificado.getApellidos() + " cuyo DNI es " + usuario_identificado.getDNI_Usuario_Identificado() + " y vive en " + direccion.toString());
        controlador.getSession().close();
    }
}

