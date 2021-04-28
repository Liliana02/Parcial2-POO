
package Tarea;

/**
 *
 * @author Liliana Lozano
 */
public abstract class  Animal {
    private int edad;
    private double peso;

    public Animal(){this.edad = 12;this.peso = 12.5;}
    
    public Animal(int edad, double peso){this.edad = edad; this.peso = peso;}
    
    public int getEdad(){
        return edad;
    }
    public double getPeso(){
        return peso;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
