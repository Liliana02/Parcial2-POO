package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Lobo lobo = new Lobo();
        Gato gato = new Gato();
        Tigre tigre = new Tigre();
        Aguila aguila = new Aguila();
        Paloma paloma = new Paloma();
        Salmon salmon = new Salmon();
        Trucha trucha = new Trucha();
        
        System.out.println("--PERRO--");
        perro.setVivienda("Casa");
        System.out.println(perro.vivienda);
        perro.setAlimentarse("Croquetas");
        System.out.println(perro.alimentarse);
        perro.setEdad(4);
        System.out.println(perro.edad);
        perro.setClimaV("Templado");
        System.out.println(perro.climaV);
        perro.sethSueño(8);
        System.out.println(perro.hSueño);
        
        System.out.println("--LOBO--");
        lobo.setVivienda("Bosques");
        System.out.println(lobo.vivienda);
        lobo.setAlimentarse("Roedores");
        System.out.println(lobo.alimentarse);
        lobo.setEdad(13);
        System.out.println(lobo.edad);
        lobo.setColor("Negro");
        System.out.println(lobo.color);
        lobo.setClimaV("Tropical");
        System.out.println(lobo.climaV);
        lobo.sethSueño(7);
        System.out.println(lobo.hSueño);
        
        System.out.println("--GATO--");
        gato.setVivienda("Casa");
        System.out.println(gato.vivienda);
        gato.setAlimentarse("Leche");
        System.out.println(gato.alimentarse);
        gato.setEdad(3);
        System.out.println(gato.edad);
        gato.setColor("Gris");
        System.out.println(gato.color);
        gato.setTamG(45);
        System.out.println(gato.tamG);
        gato.setColorO("Verdes");
        System.out.println(gato.colorO);
        
        System.out.println("--TIGRE--");
        tigre.setVivienda("Selvas");
        System.out.println(tigre.vivienda);
        tigre.setAlimentarse("Ciervo");
        System.out.println(tigre.alimentarse);
        tigre.setEdad(15);
        System.out.println(tigre.edad);
        tigre.setColor("Naranja");
        System.out.println(tigre.color);
        tigre.setTamG(67);
        System.out.println(tigre.tamG);
        tigre.setColorO("Azul");
        System.out.println(tigre.colorO);
        
        System.out.println("--AGUILA--");
        aguila.setVivienda("Montañas");
        System.out.println(aguila.vivienda);
        aguila.setAlimentarse("Roedores");
        System.out.println(aguila.alimentarse);
        aguila.setNombre("Aguilita");
        System.out.println(aguila.nombre);
        aguila.setPeso(23.3);
        System.out.println(aguila.peso);
        aguila.settVuelo("Rapido");
        System.out.println(aguila.tVuelo);
        aguila.setColor("Cafe");
        System.out.println(aguila.color);
        
        System.out.println("--PALOMA--");
        paloma.setVivienda("Nidos");
        System.out.println(paloma.vivienda);
        paloma.setAlimentarse("Gusanos");
        System.out.println(paloma.alimentarse);
        paloma.setNombre("Palomita");
        System.out.println(paloma.nombre);
        paloma.setPeso(12.5);
        System.out.println(paloma.peso);
        paloma.settVuelo("Lento");
        System.out.println(paloma.tVuelo);
        paloma.setColor("Blanca");
        System.out.println(paloma.color);
        
        System.out.println("--SALMON--");
        salmon.setVivienda("Agua dulce");
        System.out.println(salmon.vivienda);
        salmon.setAlimentarse("Plancton");
        System.out.println(salmon.alimentarse);
        salmon.setNombre("Salmoncito");
        System.out.println(salmon.nombre);
        salmon.setPeso(6.5);
        System.out.println(salmon.peso);
        salmon.setNumAleta(8);
        System.out.println(salmon.numAleta);
        salmon.setNumColor(2);
        System.out.println(salmon.numColor);
        
        System.out.println("--TRUCHA--");
        trucha.setVivienda("Agua dulce");
        System.out.println(trucha.vivienda);
        trucha.setAlimentarse("Crustaceos");
        System.out.println(trucha.alimentarse);
        trucha.setNombre("Truchita");
        System.out.println(trucha.nombre);
        trucha.setPeso(12.7);
        System.out.println(trucha.peso);
        trucha.setNumAleta(8);
        System.out.println(trucha.numAleta);
        trucha.setNumColor(5);
        System.out.println(trucha.numColor);

        
    }
    
}
