package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public class Tigre extends Felino{

    @Override
    public void setVivienda(String vivienda) {
       this.vivienda = vivienda;
    }

    @Override
    public void setAlimentarse(String alimentarse) {
       this.alimentarse = alimentarse;
    }

    @Override
    public void setColorO(String colorO) {
        super.setColorO(colorO); 
    }

    @Override
    public String getColorO() {
        return super.getColorO();
    }

    @Override
    public void setTamG(int tamG) {
        super.setTamG(tamG); 
    }

    @Override
    public int getTamG() {
        return super.getTamG();
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
