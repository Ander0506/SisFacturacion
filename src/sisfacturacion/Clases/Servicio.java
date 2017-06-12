
package sisfacturacion.Clases;

import java.io.Serializable;
import java.util.Objects;


public class Servicio implements Serializable{
    private String codigo;
    private String nombre;
    private double precio;
    private boolean estado = true;

    public Servicio(String codigo, String nombre, double precio)throws Exception{
        if (codigo == null) {
            throw new Exception("El codigo no puede ser nulo");
        }
        if (nombre == null) {
            throw new Exception("El nombre no puede ser nulo");
        }
        if (precio < 0) {
            throw new Exception("El precio debe ser positivo");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws Exception{
        if (nombre == null) {
            throw new Exception("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio)throws Exception{
        if (precio < 0) {
            throw new Exception("El precio debe ser positivo");
        }
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 17 * hash + (this.estado ? 1 : 0);
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
        final Servicio other = (Servicio) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + " " + nombre;
    }
    
    public void activar(){
        estado = true;
    }
    
    public void desactivar(){
        estado = false;
    }
    
    
    
}
