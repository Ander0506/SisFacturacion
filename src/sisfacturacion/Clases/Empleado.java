
package sisfacturacion.Clases;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class Empleado implements Serializable{
    private String id;
    private String nombre;
    private String apellido;
    private String dir;
    private String telefono;
    private Map <String, LinkedList<Servicio>> servicioPorEmpleado;
    private double sueldo;
    private boolean estado = true;

    public Empleado(String id, String nombre, String apellido, String dir)throws Exception{
        if (id == null) {
            throw new Exception("El id no puede ser nulo");
        }
        
        if (nombre == null) {
            throw new Exception("El nombre no puede ser nulo");
        }
        
        if (apellido == null) {
            throw new Exception("El apellido no puede ser nulo");
        }
        
        if (dir == null) {
            throw new Exception("La direccion no puede ser nula");
        }
        
        
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dir = dir;
        this.servicioPorEmpleado = new LinkedHashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id)throws Exception{
        if (id == null) {
            throw new Exception("El id no puede ser nulo");
        }
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido)throws Exception{
        if (apellido == null) {
            throw new Exception("El apellido no puede ser nulo");
        }
        this.apellido = apellido;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir)throws Exception{
        if (dir == null) {
            throw new Exception("La direccion no puede ser nula");
        }
        this.dir = dir;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellido);
        hash = 83 * hash + Objects.hashCode(this.dir);
        hash = 83 * hash + Objects.hashCode(this.telefono);
        hash = 83 * hash + Objects.hashCode(this.servicioPorEmpleado);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        hash = 83 * hash + (this.estado ? 1 : 0);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + apellido + " " + dir + " " + telefono + " " + servicioPorEmpleado + " " + sueldo + " " + estado;
    }
    
    
    public void adicionarServicio(Servicio nuevoServicio, String fechaServicio)throws Exception{
        if (nuevoServicio == null) {
            throw  new Exception("Servicio no puede ser nulo");
        }
         LinkedList<Servicio> spe = new LinkedList<>();
        if (servicioPorEmpleado.get(fechaServicio) == null) {
            spe.add(nuevoServicio);
            servicioPorEmpleado.put(fechaServicio, spe);
        }else{
            spe = servicioPorEmpleado.get(fechaServicio);
            spe.add(nuevoServicio);
            servicioPorEmpleado.put(fechaServicio, spe);
        }
    }
    
    public boolean buscarServicio(Servicio servicioABuscar, String fechaServicio)throws Exception{
        LinkedList<Servicio> spe = new LinkedList<>();
        if (servicioABuscar == null) {
            throw new Exception("El servicio a buscar no puede ser nulo");
        }
        return servicioPorEmpleado.get(fechaServicio).contains(servicioABuscar);
    }
    
    public boolean eliminarServicio(Servicio servicioAEliminar, String fechaServicio)throws Exception{
        LinkedList<Servicio> spe = new LinkedList<>();
        if (servicioAEliminar == null) {
            throw new Exception("El servicio a eliminar no puede ser nulo");
        }
        return servicioPorEmpleado.get(fechaServicio).remove(servicioAEliminar);
    }
    
    public void activar(){
        estado = true;
    }
    
    public void desactivar(){
        estado = false;
    }
    
}

//ap<Integer, String> nombreMap = new HashMap<Integer, String>();
//nombreMap.size(); // Devuelve el numero de elementos del Map
//nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
//nombreMap.put(K clave, V valor); // Añade un elemento al Map
//nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
//nombreMap.clear(); // Borra todos los componentes del Map
//nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
//nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
//nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
//nombreMap.values(); // Devuelve una "Collection" con los valores del Map


//Iterator it = map.keySet().iterator();
//while(it.hasNext()){
//  Integer key = it.next();
//  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
