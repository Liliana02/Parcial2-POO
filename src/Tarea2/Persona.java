package Tarea2;

/**
 *
 * @author Liliana Lozano
 */
public abstract class Persona implements Administrador{
    protected String nombre;
    protected int edad;
    protected String direccion;

    @Override
    public abstract void setPagarServicio();

    @Override
    public abstract void setAbonar();

    @Override
    public abstract void setRetirar();

    @Override
    public abstract void setDepositar();

}
