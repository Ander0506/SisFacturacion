
package sisfacturacion.Clases;

import java.io.*;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Sistema implements Serializable{
    private LinkedList<Articulo> articulos;
    private LinkedList<Empleado> empleados;
    private LinkedList<Servicio> servicios;
    private LinkedList<Factura> facturas;
    private final String OBJETO_SERIALIZABLE = "INSERT INTO servicio(Nombre_Objeto, Objeto_Serializado) VALUES (?, ?)";
    private final String OBJETO_DESERIALIZABLE = "SELECT serialized_object FROM serialized_java_objects WHERE serialized_id = ?";
    private final String EMPLEADO_BD = "INSERT INTO empleados(Id, Nombre, Apellido, Direccion, Telefono, Estado) VALUES (?,?,?,?,?,?)";

    public Sistema() {
        articulos = new LinkedList<>();
        empleados = new LinkedList<>();
        servicios = new LinkedList<>();
        facturas = new LinkedList<>();
    }
    
    //Adicionar
    
    public void adicionarArticulo(Articulo nuevoArticulo) throws Exception {
        
        if (nuevoArticulo == null) {
            throw new Exception("Nuevo articulo no puede ser nulo");
        }
        
        if (articulos.contains(nuevoArticulo)) {
            throw new Exception("Articulo ya existente");
        }
        
        articulos.add(nuevoArticulo);
    }
    
    public void adicionarEmpleado(Empleado nuevoEmpleado) throws Exception {
        
        if (nuevoEmpleado == null) {
            throw new Exception("Nuevo empleado no puede ser nulo");
        }
        
        if (empleados.contains(nuevoEmpleado)) {
            throw new Exception("Empleado ya existente");
        }
        
        empleados.add(nuevoEmpleado);
    }
    
    public void adicionarServicio(Servicio nuevoServicio) throws Exception {
        
        if (nuevoServicio == null) {
            throw new Exception("Nuevo servicio no puede ser nulo");
        }
        
        if (servicios.contains(nuevoServicio)) {
            throw new Exception("Servicio ya existente");
        }
        
        servicios.add(nuevoServicio);
    }
    
    public void adicionarFactura(Factura nuevaFactura) throws Exception {
        
        if (nuevaFactura == null) {
            throw new Exception("Nueva factura no puede ser nulo");
        }
        
        if (facturas.contains(nuevaFactura)) {
            throw new Exception("Factura ya existente");
        }
        
        facturas.add(nuevaFactura);
    }
    
    //Buscar
    
    public boolean buscarArticulo(Articulo articuloABuscar) throws Exception {
        if (articuloABuscar == null) {
            throw new Exception("Articulo no puede ser nulo");
        }
        return articulos.contains(articuloABuscar);
    }
    
    public boolean buscarEmpleado(Empleado empleadoABuscar) throws Exception {
        if (empleadoABuscar == null) {
            throw new Exception("Empleado no puede ser nulo");
        }
        return empleados.contains(empleadoABuscar);
    }
    
    public boolean buscarServicio(Servicio servicioABuscar) throws Exception {
        if (servicioABuscar == null) {
            throw new Exception("Servicio no puede ser nulo");
        }
        return servicios.contains(servicioABuscar);
    }
    
    public boolean buscarFactura(Factura facturaABuscar) throws Exception {
        if (facturaABuscar == null) {
            throw new Exception("Factura no puede ser nulo");
        }
        return facturas.contains(facturaABuscar);
    }
    
    //Desactivar
    
    public boolean desactivarArticulo(Articulo articuloADesactivar) throws Exception {
        if (articuloADesactivar == null) {
            throw new Exception("Articulo no puede ser nulo");
        }
        
        if (!buscarArticulo(articuloADesactivar)) {
            throw new Exception("Articulo no existe");
        }
        
        Articulo articuloBuscado = articulos.get(articulos.indexOf(articuloADesactivar));
        articuloBuscado.desactivar();
        return true;
    }
    
    public boolean desactivarEmpleado(Empleado empleadoADesactivar) throws Exception {
        if (empleadoADesactivar == null) {
            throw new Exception("Empleado no puede ser nulo");
        }
        
        if (!buscarEmpleado(empleadoADesactivar)) {
            throw new Exception("Empleado no existe");
        }
        
        Empleado empleadoBuscado = empleados.get(empleados.indexOf(empleadoADesactivar));
        empleadoBuscado.desactivar();
        return true;
    }
    
    public boolean desactivarServicio(Servicio servicioADesactivar) throws Exception {
        if (servicioADesactivar == null) {
            throw new Exception("Servicio no puede ser nulo");
        }
        
        if (!buscarServicio(servicioADesactivar)) {
            throw new Exception("Servicio no existe");
        }
        
        Servicio servicioBuscado = servicios.get(servicios.indexOf(servicioADesactivar));
        servicioBuscado.desactivar();
        return true;
    }
    
    public boolean desactivarFactura(Factura facturaADesactivar) throws Exception {
        if (facturaADesactivar == null) {
            throw new Exception("Factura no puede ser nulo");
        }
        
        if (!buscarFactura(facturaADesactivar)) {
            throw new Exception("Factura no existe");
        }
        
        Factura facturaBuscada = facturas.get(facturas.indexOf(facturaADesactivar));
        facturaBuscada.desactivar();
        return true;
    }
    
    public LinkedList<Articulo> listaDeArticulos(){
        return articulos;
    }
    
    public LinkedList<Empleado> listaDeEmpleados(){
        return empleados;
    }
    
    public LinkedList<Servicio> listaDeServicios(){
        return servicios;
    }
    
    public LinkedList<Factura> listaDeFacturas(){
        return facturas;
    }
    
    
    public void guardar(String archivo) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    public static Sistema cargar(String archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            if (fis.available() == 0) {
                Sistema sistemaLeido = new Sistema();
                sistemaLeido.guardar(archivo);
            }
            ObjectInputStream ois = new ObjectInputStream(fis);
            Sistema sistemaLeido = (Sistema) ois.readObject();
            return sistemaLeido;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public void vaciarTabla(JTable tabla) {

        DefaultTableModel dt = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < dt.getRowCount(); i++) {
            dt.removeRow(i);

        }
    }
     
     public void guardarBD(Connection conexion, Object objetoAGuardar)throws Exception{
         if (objetoAGuardar.getClass() == Empleado.class) {
             Empleado nuevoEmpleado = (Empleado) objetoAGuardar;
             PreparedStatement pstmt = conexion.prepareStatement(EMPLEADO_BD);
             pstmt.setString(1,nuevoEmpleado.getId());
             pstmt.setString(2,nuevoEmpleado.getNombre());
             pstmt.setString(3,nuevoEmpleado.getApellido());
             pstmt.setString(4,nuevoEmpleado.getDir());
             pstmt.setString(5,nuevoEmpleado.getTelefono());
             if (nuevoEmpleado.isEstado()) {
                 pstmt.setBoolean(6,true); 
             }else{
                 pstmt.setBoolean(6, false);
             }
             pstmt.executeUpdate();
             pstmt.close();
         }
     }
     
     public long serializarObjJavaASQL(Connection conneccion, Object objetoASerializar) throws SQLException {

		PreparedStatement pstmt = conneccion.prepareStatement(OBJETO_SERIALIZABLE);

		pstmt.setString(1, objetoASerializar.getClass().getName());
		pstmt.setObject(2, objetoASerializar);
		pstmt.executeUpdate();
		ResultSet resultado = pstmt.getGeneratedKeys();
		int serializado_id = -1;
		if (resultado.next()) {
			serializado_id = resultado.getInt(1);
		}
		resultado.close();
		pstmt.close();
		return serializado_id;
	}
     
}
