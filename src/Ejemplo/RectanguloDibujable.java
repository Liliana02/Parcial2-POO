
package Ejemplo;

import java.awt.Graphics;

/**
 *
 * @author Liliana Lozano
 */
public class RectanguloDibujable extends Cuadrado implements FiguraDibujable{

    private int  x, y;

    public RectanguloDibujable(int x, int y, double valor1) {
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
        
    }
    
}
