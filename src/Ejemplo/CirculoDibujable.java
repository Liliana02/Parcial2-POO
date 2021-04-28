
package Ejemplo;

import java.awt.Graphics;

/**
 *
 * @author Liliana Lozano
 */
public class CirculoDibujable extends Circulo implements FiguraDibujable{
    
    private int x;
    private int y;

    public CirculoDibujable(int x, int y, double valor1) {
        super(valor1);
        this.x = x;
        this.y = y;
    }
    

    @Override
    public void setCoordenadas(int x, int y) {
        this.x =x;
        this.y =y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        g.drawOval(this.x, this.y, (int)this.valor1,(int)this.valor1);
    }
    
}
