package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Canino extends Mamifero{
    protected int hSueño;
    protected String climaV;

    public int gethSueño() {
        return hSueño;
    }

    public void sethSueño(int hSueño) {
        this.hSueño = hSueño;
    }

    public String getClimaV() {
        return climaV;
    }

    public void setClimaV(String climaV) {
        this.climaV = climaV;
    }
}
