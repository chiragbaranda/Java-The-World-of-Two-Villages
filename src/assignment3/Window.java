/*
 * this class is created to create a window in house
 */
package Assignment3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 *
 * @author CHIRAG
 */
public class Window {
    private double x;
    private double y;
    private double diameter;

    public Window(double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void draw(GraphicsContext gc){
        gc.setFill(Color.BROWN);
        gc.fillOval(x, y, diameter, diameter);


    }
    
}
