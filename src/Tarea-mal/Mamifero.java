
package Tarea;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Mamifero extends Animal {

    @Override
    public double getEstatura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEstatura(double estatura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void setEdad(int edad){
    this.edad = edad;
    }
    public void setPeso(double peso){
    this.peso = peso;
    }

    
    
}
