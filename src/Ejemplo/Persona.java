
package Ejemplo;

/**
 *
 * @author Liliana Lozano
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String correo;

    public Persona() {
        this.idPersona = 1;
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.correo = "correo";
    }
    
    public void Calcular(){
        System.out.println("1+1=2");
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
