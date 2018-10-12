package ObjectDrawPro;

import objectdraw.*;
import java.awt.*;

/**
 * The main manager file for the engine, this is what is accessed to determine things.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Game {
    private static Driver driver;
    
    private DrawingCanvas mainCanvas;
    
    private DrawingCanvas[] scenes;
    
    Game() {
        driver = new Driver(800, 600);
        mainCanvas = driver.getCanvas();
    }
    
    public void switchScene(DrawingCanvas newCanvas) {
        mainCanvas.clear();
        mainCanvas = newCanvas;
    }
}