package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public class Trucha extends Pez{

    @Override
    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    @Override
    public void setAlimentarse(String alimentarse) {
       this.alimentarse = alimentarse;
    }

    @Override
    public void setNumColor(int numColor) {
        super.setNumColor(numColor); 
    }

    @Override
    public int getNumColor() {
        return super.getNumColor(); 
    }

    @Override
    public void setNumAleta(int numAleta) {
        super.setNumAleta(numAleta);
    }

    @Override
    public int getNumAleta() {
        return super.getNumAleta();
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso); 
    }

    @Override
    public double getPeso() {
        return super.getPeso(); 
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }
    
}
