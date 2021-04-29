package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public class Lobo extends Canino{

    @Override
    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    @Override
    public void setAlimentarse(String alimentarse) {
        this.alimentarse = alimentarse;
    }

    @Override
    public void setClimaV(String climaV) {
        super.setClimaV(climaV);
    }

    @Override
    public String getClimaV() {
        return super.getClimaV();
    }

    @Override
    public void sethSueño(int hSueño) {
        super.sethSueño(hSueño);
    }

    @Override
    public int gethSueño() {
        return super.gethSueño();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); 
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }
    
}
