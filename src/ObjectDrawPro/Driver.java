package ObjectDrawPro;

import objectdraw.*;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.EventListener;
import java.util.ArrayList;

import ObjectDrawPro.Listeners.StartListener;

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
    
    public void addMouseListener(MouseListener listener) {
        listeners.add(listener);
        this.addMouseListener(listener);
    }
    
    public void addKeyListener(KeyListener listener) {
        listeners.add(listener);
        this.addKeyListener(listener);
    }
    
    // BEGIN FUNCTION FROM WINDOW CONTROLLER
    public void begin() {
        listeners.forEach((listener) -> {
            if(listener instanceof StartListener) {
                ((StartListener)listener).onBegin();
            }
        });
    }
    
    // MOUSE EVENT HANDLERS //
    public void onMousePress(Location point) {
        
    }
    
    public void onMouseRelease(Location point) {
        
    }
    
    public void onMouseDrag(Location point) {
        
    }
    
    public void onMouseEnter(Location point) {
        
    }
    
    public void onMouseExit(Location point) {
        
    }
    ///////////////////////////
}