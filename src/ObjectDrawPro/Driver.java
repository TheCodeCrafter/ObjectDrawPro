package ObjectDrawPro;

import objectdraw.*;

import java.util.ArrayList;
import java.util.EventListener;

/**
 * A backend-reference for an automatic creation and management of a DrawingCanvas.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */

public class Driver extends WindowController {
    
    private static final long serialVersionUID = 1;
    
    private ArrayList<EventListener> listeners = new ArrayList<EventListener>();
    
    Driver(int width, int height) {
        this.startController(width, height);
    }
    
    public DrawingCanvas getCanvas() {
        return canvas;
    }
    
    public ArrayList<EventListener> getListeners() {
        return listeners;
    }
    
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }
}