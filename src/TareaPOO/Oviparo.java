package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Oviparo extends Animal{
    protected String nombre;
    protected double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
