
package sisfacturacion.Clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConeccionBD {
    
    Connection coneccion;
    
    public Connection conexion(){
        String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/prueba";
		String username = "Ander0506";
		String password = "manda0124880506";
        try {
            Class.forName(driver);
            coneccion = DriverManager.getConnection(url, username, password);
            System.out.println("Coneccion Exitosa");
        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
	return coneccion;	
    }
    
//    Statement createStatement(){
//        throw new UnsupportedOperationException("No soportado");
//    }
    
}
