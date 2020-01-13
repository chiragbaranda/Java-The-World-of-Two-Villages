/*
* This class is created for to create the village, which calls the home constuctor here.
*/

package Assignment3;

import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author CHIRAG
 */
public class Village {
    Random rand= new Random();
    private double x;
    private double y;
    private double sum;
    private int MAX = 150;
    private int MIN = 100;
    private int POPMAX = 50;
    private int POPMIN = 5;
    
    private double size = rand.nextInt(MAX - MIN + 1) + MIN;
    private Color color;
    private String name;
    private House house1;
    private House house2;
    private House house3;
    

    public Village(String name, int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;
        
        
        for (int i = 0; i < 3; i++) 
        {
            int population = rand.nextInt(POPMAX - POPMIN + 1) + POPMIN;
            switch(i)
            {
                case 0: house1 = new House(x, y, size, color); sum=sum+house1.getSize(); house1.setOccupants(population); break;
                case 1: house2  = new House((x + (size + 20)), (y + (size - (size *  0.90))), size * 0.90, color); sum=sum+house2.getSize(); break;
                case 2: house3  = new House((x + (size * 2) + 20), (y + (size - (size * 0.80))), size * 0.80, color); sum=sum+house3.getSize(); break;
                default: System.out.println("ERROR!!!");
            }
        }
        sum = 40 + (sum*20)/100;
            System.out.printf("sum: %.2f m \n",sum);
        /*
        house1 = new House(x, y, size, color);
        house2  = new House((x + (size + 20)), (y + (size - (size *  0.90))), size * 0.90, color);
        house3  = new House((x + (size * 2) + 20), (y + (size - (size * 0.80))), size * 0.80, color);
        */
    }

    
            
    public void draw(GraphicsContext gc) {
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);
        gc.setStroke(Color.ORANGE);
        gc.strokeText("Village name: "+ name + " Size: "+ sum + "\nPopulation: "+ house1.getOccupants(), x+size , y+size+ 20);
        
    }
    
}
