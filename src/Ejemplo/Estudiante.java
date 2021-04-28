
package Ejemplo;

/**
 *
 * @author Liliana Lozano
 */
public class Estudiante extends Persona{
    private int codigo;
    private String facultad;

    public Estudiante(int codigo, String facultad) {
        super();
        this.codigo = codigo;
        this.facultad = facultad;
    }
    
    public void Calcular(){
        super.Calcular();
        System.out.println("2+2=4");
    }

    public String Saludar(String nombre){
        String msg = "Hola " + nombre + ", tu id es: " + super.getIdPersona();
        return msg;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
}
