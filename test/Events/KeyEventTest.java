import objectdraw.*;
import java.awt.*;
import java.util.*;
import ObjectDrawPro.*;

public class KeyEventTest {
    
    Game game;
    
    public static void main(String[] args) {
        game = new Game(800, 600);
        
        game.addStartListener(() -> {
            // Some nice begin code here
            begin();
        });
        
        game.addKeyListener((KeyEvent e) -> {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed");
            }
            
            public void keyReleased(KeyEvent e) {
                System.out.println("Key released")
            }
        });
        
        // BASIC IMPLEMENTATION:
        
        /*
         * game.onKeyPress((KeyEvent e) -> keyPressEvent(e));
         * 
         * public void keyPressEvent(e) {
         *   System.out.println("KeyPress: " + e.getCode());
         * }
         *
         */
    }
    
    public void begin() {
        // code code code code code code code code code code code code code
    }
}