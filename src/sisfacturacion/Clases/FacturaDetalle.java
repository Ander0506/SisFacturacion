package sisfacturacion.Clases;

import java.io.Serializable;
import java.util.Objects;

public class FacturaDetalle implements Serializable{
    private String codigo;
    private Articulo articuloVendido;
    private double precioVenta;
    private double cantidad;
    private double total;

    public FacturaDetalle(String codigo, Articulo articuloVendido, double precioVenta, double cantidad)throws Exception{
        if (codigo == null) {
            throw new Exception("El codigo no puede ser nulo");
        }
        
        if (articuloVendido == null) {
            throw new Exception("El articulo no puede ser nulo");
        }
        
        if (precioVenta <= 0) {
            throw new Exception("El precio de venta debe ser positivo");
        }
        
        if (cantidad <= 0) {
            throw new Exception("La cantidad debe ser positiva");
        }
        
        this.codigo = codigo;
        this.articuloVendido = articuloVendido;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.total = this.precioVenta * this.cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo)throws Exception{
        if (codigo == null) {
            throw new Exception("El codigo no puede ser nulo");
        }
        this.codigo = codigo;
    }

    public Articulo getArticuloVendido() {
        return articuloVendido;
    }

    public void setArticuloVendido(Articulo articuloVendido)throws Exception{
        if (articuloVendido == null) {
            throw new Exception("El articulo no puede ser nulo");
        }
        this.articuloVendido = articuloVendido;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta)throws Exception{
        if (precioVenta <= 0) {
            throw new Exception("El precio de venta debe ser positivo");
        }
        this.precioVenta = precioVenta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad)throws Exception{
        if (cantidad <= 0) {
            throw new Exception("La cantidad debe ser positiva");
        }
        this.cantidad = cantidad;
        this.total = this.precioVenta * this.cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codigo);
        hash = 29 * hash + Objects.hashCode(this.articuloVendido);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precioVenta) ^ (Double.doubleToLongBits(this.precioVenta) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.cantidad) ^ (Double.doubleToLongBits(this.cantidad) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
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
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + " " + articuloVendido + " " + precioVenta + " " + cantidad + " " + total;
    }

    
    
}
