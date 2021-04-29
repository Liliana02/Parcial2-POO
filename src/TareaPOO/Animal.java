package TareaPOO;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Animal implements Comportamiento{
    protected String vivienda;
    protected String alimentarse;

    public String getVivienda() {
        return vivienda;
    }

    @Override
    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public String getAlimentarse() {
        return alimentarse;
    }

    @Override
    public void setAlimentarse(String alimentarse) {
        this.alimentarse = alimentarse;
    }
    
    
}
