package Tarea2;

/**
 *
 * @author Liliana Lozano
 */
public class Cliente extends Persona{
    private int noSocio;
    private String tipoCuenta;

    public int getNoSocio() {
        return noSocio;
    }

    public void setNoSocio(int noSocio) {
        this.noSocio = noSocio;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void setPagarServicio() {
        
    }

    @Override
    public void setAbonar() {
        
    }

    @Override
    public void setRetirar() {
        
    }

    @Override
    public void setDepositar() {
        
    }
    
    
}
