package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Pez extends Oviparo {
    protected int numAleta;
    protected int numColor;

    public int getNumAleta() {
        return numAleta;
    }

    public void setNumAleta(int numAleta) {
        this.numAleta = numAleta;
    }

    public int getNumColor() {
        return numColor;
    }

    public void setNumColor(int numColor) {
        this.numColor = numColor;
    }
}
