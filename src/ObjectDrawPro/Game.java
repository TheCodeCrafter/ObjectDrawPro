package ObjectDrawPro;

import objectdraw.*;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.HashMap;

import ObjectDrawPro.Listeners.StartListener;

/**
 * The main manager file for the engine, this is what is accessed to determine things.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Game {
    private Driver driver;
    
    private DrawingCanvas mainCanvas;
    private Scene scene;
    
    private HashMap<String, Scene> scenes = new HashMap<String, Scene>();
    
    /**
     * The constructor for a simple Game object to handle events and scene management.&nbsp;Creates a window.
     * 
     * @param width The width of the new window
     * @param height The height of the new window
     * @return A new Game object and creates a new AWT JApplet Window (Based off of WindowController)
     */
    Game(int width, int height) {
        driver = new Driver(width, height);
        mainCanvas = driver.getCanvas();
    }
    
    /**
     * Switches the current visible scene to a brand new scene, and adds it to the scene list.
     * 
     * @param newScene The new scene object that will be used
     * @return void
     */
    public void switchScene(Scene newScene) {
        mainCanvas.clear();
        
        scene = newScene;
        
        mainCanvas = scene.getCanvas();
    }
    
    public void setScene(String sceneName) {
        mainCanvas.clear();
        
        scene = scenes.get(sceneName);
        
        mainCanvas = scene.getCanvas();
    }
    
    public Scene getScene(String name) {
        return scenes.get(name);
    }
    
    public Scene getCurrentScene() {
        return scene;
    }
    
    public void addStartListener(StartListener listener) {
        driver.addListener(listener);
    }
    
    public void addMouseListener(MouseListener listener) {
        driver.addListener(listener);
    }
    
    public void addKeyListener(KeyListener listener) {
        driver.addKeyListener(listener);
    }
}