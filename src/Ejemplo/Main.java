
package Ejemplo;

/**
 *
 * @author Liliana Lozano
 */
public class Main {

    public static void main(String[] args) {
//        Estudiante estudiante = new Estudiante(
//        codigo: 1,
//        facultad: "info");
//        
//    System.out.println(estudiante.Saludar(nombre:"Miguel"));
//    estudiante.Calcular();
    Cuadrado cuadrado = new Cuadrado(3);
    System.out.println("El area es: "+ 
            cuadrado.getArea());
        System.out.println("El perimetro es: "+
                cuadrado.getPerimetro());
    Circulo circulo = new Circulo(5);
    System.out.println("El area del circulo: " + circulo.getArea());
        System.out.println("El perimetro del circulo: " + circulo.getPerimetro());
    
       CirculoDibujable c= new CirculoDibujable(3,2,2); 

        
    }
    
    
}
