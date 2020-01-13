/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment3;

import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author CHIRAG
 */
public class House {
    Random rand= new Random();
    
    private double x;
    private double y;
    private double size;
    private int occupants;
    private Color color;
    private Door door;
    private Window window;

    public House(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        
        window = new Window(x + (size/8) , y + (size/8), size/4);
        door = new Door(x + (size / 2), y + (size/2), size/2);
    }

    public House(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getSize() {
        return size;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

     public void draw(GraphicsContext gc){

        gc.setFill( color );
        gc.fillRect(x, y, size, size);

        door.draw(gc);
        window.draw(gc);
    }
    
}
