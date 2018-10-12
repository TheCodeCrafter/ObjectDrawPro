package ObjectDrawPro;

import objectdraw.*;

import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * A backend-reference for an automatic creation and management of a DrawingCanvas.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */

public class Driver extends WindowController {
    
    private static final long serialVersionUID = 1;
    
    private ArrayList<ActionListener> listeners = new ArrayList<ActionListener>();
    
    Driver(int width, int height) {
        this.startController(width, height);
    }
    
    public DrawingCanvas getCanvas() {
        return canvas;
    }
    
    public ArrayList<ActionListener> getListeners() {
        return listeners;
    }
    
    
}