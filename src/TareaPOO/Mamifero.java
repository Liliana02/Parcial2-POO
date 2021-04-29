package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Mamifero extends Animal{
    protected int edad;
    protected String color;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
