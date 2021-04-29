package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Ave extends Oviparo{
    protected String tVuelo;
    protected String color;

    public String gettVuelo() {
        return tVuelo;
    }

    public void settVuelo(String tVuelo) {
        this.tVuelo = tVuelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
