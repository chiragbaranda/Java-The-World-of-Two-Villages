/*
*This is a main class for The Village and The Village program.
*In this file Main canvas is created and the house of the emperor is created
*
*/
package Assignment3;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Chirag Baranda 000759867
 */
public class Assignment3 extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        final int CANVAS_WIDTH = 1000;
        final int CANVAS_HEIGHT = 700;
        
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 
        /* Create canvas*/
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        
        /*Creating emperor house */
        gc.setFill(Color.GOLD);
        gc.fillRect(800, 300, 200, 200);
        Door d1= new Door( 900 , 400 , 100);
        Window w1= new Window(825, 325, 50);
        d1.draw(gc);
        w1.draw(gc);
        
        
        /*Creation of two villages */
        
        Village v1 = new Village("Village 1", 100, 400, Color.YELLOW);
        v1.draw(gc);
        
        Village v2 = new Village("Village 2", 100, 120, Color.BLUE);
        v2.draw(gc);
        
        
        
        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
