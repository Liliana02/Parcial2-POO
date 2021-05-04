package Tarea2;

/**
 *
 * @author Liliana Lozano
 */
public class Usuario extends Persona{
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public void setPagarServicio() {
        
    }

    @Override
    public void setAbonar() {
        
    }

    @Override
    public void setRetirar() {
        
    }

    @Override
    public void setDepositar() {
        
    }
    
}
