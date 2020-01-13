/*
 * this class is created to create a door in house.
 */

package Assignment3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author CHIRAG
 */
public class Door {
    private double x;
    private double y;
    private double height;
    //private Window window;

    public Door(double doorx, double doory, double doorheight) {
        x = doorx;
        y = doory;
        height = doorheight;
        //window = new Window(doorx - (doorheight), doory - (doorheight ), doorheight/2.15);
    }

    public void draw(GraphicsContext gc){

        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, height/2, height);

        //window.draw(gc);
    }
    
    
}
