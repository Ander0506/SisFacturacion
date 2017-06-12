
package sisfacturacion.Clases;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Objects;


public class Factura implements Serializable{
    private String codigo;
    private Calendar fecha = Calendar.getInstance();
    private LinkedList <FacturaDetalle> articulos;
    private LinkedList <FacturaDetalleServicio> servicios;
    private double totalPagar;
    private boolean estado = true;

    public Factura() {
        this.articulos = new LinkedList<>();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFechaString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy" /*hh:mm:ss*/);
        return sdf.format(fecha.getTime());
    }

    public Calendar getFecha() {
        return fecha;
    }
    
    

    public double getTotalPagar() {
        return totalPagar;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.codigo);
        hash = 19 * hash + Objects.hashCode(this.fecha);
        hash = 19 * hash + Objects.hashCode(this.articulos);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.totalPagar) ^ (Double.doubleToLongBits(this.totalPagar) >>> 32));
        hash = 19 * hash + (this.estado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + " " + fecha + " " + articulos + " " + totalPagar + " " + estado;
    }
    
     public void activar(){
        estado = true;
    }
    
    public void desactivar(){
        estado = false;
    }
    
    
    public void adicionarArticulo(FacturaDetalle articuloAVender)throws Exception{
        if (articuloAVender == null) {
            throw new Exception("El articulo no puede ser nulo");
        }
        articulos.add(articuloAVender);
        this.totalPagar += articuloAVender.getTotal();
    }
    
    public boolean buscarArticulo(FacturaDetalle articuloABuscar)throws Exception{
        if (articuloABuscar == null) {
            throw new Exception("El articulo no se encuentra");
        }
        return articulos.contains(articuloABuscar);
    }
    
    public boolean eliminarArticulo(FacturaDetalle articuloAEliminar) throws Exception{
        if (articuloAEliminar == null) {
            throw new Exception("El articulo a eliminar no se encuentra");
        }
        this.totalPagar -= articuloAEliminar.getTotal();
        return articulos.remove(articuloAEliminar);
    }
    
    public void adicionarServicio(FacturaDetalleServicio servicioAOfrecer)throws Exception{
        if (servicioAOfrecer == null) {
            throw new Exception("El servicio no puede ser nulo");
        }
        servicios.add(servicioAOfrecer);
        this.totalPagar += servicioAOfrecer.getPrecioServicio();
    }
}
