package ObjectDrawPro;

import objectdraw.*;
import java.awt.*;

/**
 * A backend-reference for an automatic creation and management of a DrawingCanvas.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */

public class Driver extends WindowController {
    Driver(int width, int height) {
        this.startController(width, height);
    }
    
    public DrawingCanvas getCanvas() {
        return canvas;
    }
    
    
}