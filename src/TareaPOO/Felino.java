package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Felino extends Mamifero {
    protected int tamG;
    protected String colorO;

    public int getTamG() {
        return tamG;
    }

    public void setTamG(int tamG) {
        this.tamG = tamG;
    }

    public String getColorO() {
        return colorO;
    }

    public void setColorO(String colorO) {
        this.colorO = colorO;
    }
}
