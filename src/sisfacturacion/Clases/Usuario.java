/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfacturacion.Clases;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andre
 */
public class Usuario implements Serializable{
    
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private String Genero;
    private Boolean estado = true;
    private Boolean Tipo = true;// Si es True es usuario, False Administrador
    
    public Usuario(String id, String nombre, String apellido, String telefono) throws Exception {
        
        if(id == null){
            throw new Exception("El Id no puede ser nulo");
        }
        if(nombre == null){
            throw new Exception("El nombre no puede ser nulo");
        }
        if(apellido == null){
            throw new Exception("El apellido no puede ser nulo");
        }
        if(telefono == null){
            throw new Exception("El telefono no puede ser nulo");
        }
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public Boolean getTipo() {
        return Tipo;
    }
    

    public void setId(String id) throws Exception {
        if(id == null){
            throw new Exception("El Id no puede ser nulo");
        }
        this.id = id;
    }

    public void setNombre(String nombre) throws Exception {
        if(nombre == null){
            throw new Exception("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) throws Exception {
        if(apellido == null){
            throw new Exception("El apellido no puede ser nulo");
        }
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) throws Exception {
        if(telefono == null){
            throw new Exception("El telefono no puede ser nulo");
        }
        this.telefono = telefono;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setTipo(Boolean Tipo) {
        this.Tipo = Tipo;
    }
    
     public void activar(){
        estado = true;
    }
    
    public void desactivar(){
        estado = false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + this.edad;
        hash = 67 * hash + Objects.hashCode(this.direccion);
        hash = 67 * hash + Objects.hashCode(this.telefono);
        hash = 67 * hash + Objects.hashCode(this.Genero);
        hash = 67 * hash + Objects.hashCode(this.Tipo);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id +"  " + nombre + "  " + apellido ;
    }
}
