
package Tarea;

/**
 *
 * @author Liliana Lozano
 */
public abstract class  Main {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero() {};
        Mamifero mamifero2 = new Mamifero(13, 15.3) {};
        
        System.out.println(mamifero.getEdad());
        System.out.println(mamifero.getPeso());
    }
    
}
