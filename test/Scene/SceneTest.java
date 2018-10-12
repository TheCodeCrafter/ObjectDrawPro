import objectdraw.*;
import java.util.*;
import ObjectDrawPro.*;
import java.awt.*;


/**
 * A test to see if you can create a "game" instance to instantiate an objectdraw image.
 * 
 * @author TheCodeCrafter
 * @version 1.0
 */
public class SceneTest {
    
    Game game;
    
    public static void main(String[] args) {
        game = new Game(800, 600); // This "should" create our window that's 800x600 pixels
    }
}