
package sisfacturacion.Clases;

import java.io.Serializable;
import java.util.Objects;

public class FacturaDetalleServicio implements Serializable{
    private String codigo;
    private Empleado empleado;
    private Servicio servicioPrestado;
    private double precioServicio;

    public FacturaDetalleServicio(String codigo, Empleado empleado, Servicio servicio, double precioServicio)throws Exception{
        if (codigo == null) {
            throw new Exception("El codigo no puede ser nulo");
        }
        
        if (empleado == null) {
            throw new Exception("El empleado no puede ser nulo");
        }
        
        if (servicio == null) {
            throw new Exception("El servicio no puede ser nulo");
        }
        
        this.codigo = codigo;
        this.empleado = empleado;
        this.servicioPrestado = servicio;
        this.precioServicio = precioServicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Servicio getServicioPrestado() {
        return servicioPrestado;
    }

    public void setServicioPrestado(Servicio servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.codigo);
        hash = 71 * hash + Objects.hashCode(this.empleado);
        hash = 71 * hash + Objects.hashCode(this.servicioPrestado);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.precioServicio) ^ (Double.doubleToLongBits(this.precioServicio) >>> 32));
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
        final FacturaDetalleServicio other = (FacturaDetalleServicio) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + " " + empleado + " " + servicioPrestado + " " + precioServicio;
    }
    
    
}
