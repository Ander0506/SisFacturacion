/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion.Clases;

import java.io.Serializable;
import java.util.Objects;

//crear variables
public class Articulo implements Serializable{
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private double existencia;
    private boolean estado = true;

    //definir constructor(datos necesarios)
    public Articulo(String codigo, String nombre, double precio)throws Exception{
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

    //seters y geters
    
    public void setCodigo(String codigo)throws Exception{
        if (codigo == null) {
            throw new Exception("El codigo no puede ser nulo");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre)throws Exception{
        if (nombre == null) {
            throw new Exception("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio)throws Exception{
        if (precio < 0) {
            throw new Exception("El precio debe ser positivo");
        }
        this.precio = precio;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public double getExistencia() {
        return existencia;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.categoria);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.existencia) ^ (Double.doubleToLongBits(this.existencia) >>> 32));
        hash = 89 * hash + (this.estado ? 1 : 0);
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
        final Articulo other = (Articulo) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    //gestion de estado
    public void activar(){
        estado = true;
    }
    
    public void desactivar(){
        estado = false;
    }
    
    //gestion de esxistencia
    public void adicionarExistencia(double nuevaExistencia)throws Exception{
        if (nuevaExistencia <= 0) {
            throw new Exception("Existencia debe ser positiva");
        }
        existencia += nuevaExistencia;
    }
    
    public boolean restarExistencia(double existenciaARestar)throws Exception{
        if (existenciaARestar <= 0) {
            throw new Exception("existencia a restar debe ser positiva");
        }
        if (existencia < existenciaARestar) {
            return false;
        } else {
            existencia -= existenciaARestar;
            return true;
        }
    }

    @Override
    public String toString() {
        return codigo + " " + nombre;
    }
    
    
}
