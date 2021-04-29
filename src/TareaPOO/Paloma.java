package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public class Paloma extends Ave{

     @Override
    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    @Override
    public void setAlimentarse(String alimentarse) {
       this.alimentarse = alimentarse;
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
    public void settVuelo(String tVuelo) {
        super.settVuelo(tVuelo); 
    }

    @Override
    public String gettVuelo() {
        return super.gettVuelo(); 
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
