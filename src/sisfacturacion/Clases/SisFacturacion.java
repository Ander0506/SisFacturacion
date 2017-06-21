
package sisfacturacion.Clases;

import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SisFacturacion {
    
    public static void main(String[] args){
         
        try {
            Sistema nuevosistema = new Sistema();
            ConeccionBD con = new ConeccionBD();
            Connection coneccion = con.conexion();
            Factura fac = new Factura();
            Servicio ser = new Servicio("01", "Lavado de carros", 10000);
            Empleado empleado1 = new Empleado("01", "Julio", "Amaris", "calle 56 #5f-09");
            empleado1.setTelefono("3026589745");
            Empleado empleado2 = new Empleado("02", "Alvaro", "Viloria", "calle 65 #8d-05");
            empleado1.setTelefono("3048976532");
            Empleado empleado3 = new Empleado("1045674309", "Anderson", "Jimenez", "calle 67B #4D-04");
            empleado1.setTelefono("3014153564");
            System.out.println(empleado1);
            empleado1.adicionarServicio(ser, fac.getFechaString());
            empleado1.adicionarServicio(ser, fac.getFechaString());
            empleado1.adicionarServicio(ser, fac.getFechaString());
            empleado1.adicionarServicio(ser, "09/junio/2017");
            empleado1.adicionarServicio(ser, "09/junio/2017");
            empleado1.adicionarServicio(ser, "10/junio/2017");
            empleado1.adicionarServicio(ser, "11/junio/2017");
            empleado1.adicionarServicio(ser, "11/junio/2017");
            nuevosistema.guardarBD(coneccion, empleado3);
        } catch (Exception ex) {
            Logger.getLogger(SisFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
