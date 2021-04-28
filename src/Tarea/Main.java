
package Tarea;

/**
 *
 * @author Liliana Lozano
 */
public abstract class  Main {

    public static void main(String[] args) {
//        Mamifero mamifero = new Mamifero() {};
//        
//        System.out.println(mamifero.getEdad());
//        System.out.println(mamifero.getPeso());
    Perro perro = new Perro();
    Lobo lobo = new Lobo();
    Gato gato = new Gato();
    Tigre tigre = new Tigre();
    Aguila aguila = new Aguila();
    Paloma paloma = new Paloma();
    Trucha trucha = new Trucha();
    Salmon salmon = new Salmon();
    
    perro.setEdad(5);
        System.out.println(perro.edad);
    perro.setPeso(25.5);
        System.out.println(perro.peso);
    lobo.setEdad(10);
        System.out.println(lobo.edad);
    lobo.setPeso(35.7);
        System.out.println(lobo.peso);
    gato.setEdad(4);
        System.out.println(gato.edad);
    gato.setPeso(15.32);
        System.out.println(gato.peso);
    tigre.setEdad(12);
        System.out.println(tigre.edad);
    tigre.setPeso(40.2);
        System.out.println(tigre.peso);
    aguila.setEdad(13);
        System.out.println(aguila.edad);
    aguila.setPeso(23.5);
        System.out.println(perro.peso);
    paloma.setEdad(5);
        System.out.println(paloma.edad);
    paloma.setPeso(12.4);
        System.out.println(paloma.peso);
    trucha.setEdad(3);
        System.out.println(trucha.edad);
    trucha.setPeso(12.4);
        System.out.println(gato.peso);
    salmon.setEdad(2);
        System.out.println(salmon.edad);
    salmon.setPeso(5.4);
        System.out.println(tigre.peso);
    }
    
}
