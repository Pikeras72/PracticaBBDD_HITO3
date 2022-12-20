package expresscorreos.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Connection conn = null;
    public static void main(String[] args) throws SQLException {
        initialize();
        /*EJERCICIO 1.1*/
        nuevo_cartero("22334455A","Pablo","García Hernández");

        /*EJERCICIO 1.2*/
        System.out.println("\n ----------------- Carteros que han realizado reparto con coche en los últimos 7 días ----------------- ");
        List<Cartero>carteros=carterosRepartoCochePeriodo(7);
        int cnt=1;
        for(Cartero c:carteros){System.out.println("Cartero "+cnt+++": "+c.getDNI_Cartero()+", "+c.getNombre()+" "+c.getApellidos());}

        /*EJERCICIO 1.3*/
        System.out.println("\n ----------------- Oficinas ----------------- ");
        List<Oficina>oficinas=mostrarOficinasCalle("Calle Alcalá");
        cnt=1;
        for (Oficina o:oficinas){System.out.println("Oficina "+cnt+": "+o.getCod_Oficina());}

        /*EJERCICIO 1.4*/
        System.out.println("\n ----------------- Coches que no han realizado repartos en los últimos 30 días ----------------- ");
        String coches=cochesSinUtilizarPeriodo(30);
        System.out.println(coches);
    }

    public static void initialize(){
        //PASO 1->
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //PASO 2->
        try {
            //cambiar dependiendo de cada ordenador
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicabd?user=root&password=");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void nuevo_cartero(String dni, String nombre, String apellidos) throws SQLException {
        PreparedStatement stmt;
        stmt = conn.prepareStatement("INSERT INTO `cartero` (`DNI_Cartero`,`Nombre`,`Apellidos`) VALUES (?, ?, ?)");
        stmt.setString(1, dni);
        stmt.setString(2, nombre);
        stmt.setString(3, apellidos);
        System.out.println("\n ----------------- Añadir nuevo cartero: ----------------- ");
        System.out.println("Nuevo cartero: "+dni+", "+nombre+", "+apellidos);
        stmt.executeUpdate();
    }

    public static List<Cartero> carterosRepartoCochePeriodo(int periodo) throws SQLException {
        Statement stmt;
        ResultSet rs;
        List<Cartero>carteros=new ArrayList<>();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select distinct cartero.DNI_Cartero, cartero.Nombre, cartero.Apellidos\n" +
                "from cartero inner join reparto on reparto.DNI_Cartero = cartero.DNI_Cartero\n" +
                "where reparto.Fecha_Creación between date_sub(current_date(),interval "+periodo+" day) and current_date()\n");
        while (rs.next()) {
            String dni = rs.getString("DNI_Cartero");
            String nombre = rs.getString("Nombre");
            String apellidos = rs.getString("Apellidos");
            Cartero cartero = new Cartero(dni,nombre,apellidos);
            carteros.add(cartero);
        }
        rs.close();
        return carteros;
    }

    public static List<Oficina> mostrarOficinasCalle(String nombreCalle) throws SQLException {
        Statement stmt;
        ResultSet rs;
        List<Oficina>oficinas=new ArrayList<>();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select oficina.Cod_Oficina, oficina.Nombre_Municipio, oficina.Cod_Centro_Clas, oficina.Num, oficina.Piso, oficina.Letra, oficina.Portal, oficina.Nombre_Calle \n" +
                "from oficina inner join area_Envio on oficina.Cod_Oficina = area_Envio.Cod_Oficina inner join incluye_Area_Envio on incluye_Area_Envio.ID_Area_Envio = area_Envio.ID_Area_Envio\n" +
                "where incluye_Area_Envio.Nombre_Calle = \""+nombreCalle+"\" and incluye_Area_Envio.Nombre_Municipio = \"Madrid\"");
        while (rs.next()) {
            String Cod_Oficina = rs.getString("Cod_Oficina");
            String Nombre_Municipio = rs.getString("Nombre_Municipio");
            int Cod_Centro_Clas = rs.getInt("Cod_Centro_Clas");
            int Num = rs.getInt("Num");
            int Piso = rs.getInt("Piso");
            String Letra = rs.getString("Letra");
            int Portal = rs.getInt("Portal");
            String Nombre_Calle = rs.getString("Nombre_Calle");
            Oficina oficina=new Oficina(Cod_Oficina,Nombre_Municipio,Cod_Centro_Clas,Num,Piso,Letra.charAt(0),Portal,Nombre_Calle);
            oficinas.add(oficina);
        }
        rs.close();
        return oficinas;
    }

    public static String cochesSinUtilizarPeriodo(int periodo) throws SQLException {
        Statement stmt;
        ResultSet rs;
        String coches="";
        stmt = conn.createStatement();
        rs = stmt.executeQuery("select distinct coche.Matricula from coche\n" +
                "where coche.Matricula NOT IN(" +
                "select distinct coche.Matricula from coche inner join reparto on reparto.Matricula = coche.Matricula" +
                " where reparto.Fecha_Creación between date_sub(current_date(),interval "+periodo+" day) and current_date())");
        int cnt=1;
        while (rs.next()) {
            String matricula = rs.getString("Matricula");
            coches+="Coche "+cnt+++": "+matricula+"\n";
        }
        rs.close();
        return coches;
    }
}
