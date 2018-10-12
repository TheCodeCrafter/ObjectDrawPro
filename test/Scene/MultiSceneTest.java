import objectdraw.*;
import java.awt.*;
import java.util.*;
import ObjectDrawPro.*;

/**
 * Static multi-scene test (uses static, but shows dynamic usage)
 * 
 * @author TheCodeCrafter
 * @version 1.0
 */

public class MultiSceneTest {
    
    Game game;
    
    public static void main(String[] args) {
        game = new Game(800, 600);
        
        createScenes();
    }
    
    public void createScenes() {
        Scene scene1 = new Scene(game);
        Sprite sprite1 = new Sprite(new FilledOval(scene1.getHalfWidth(), scene1.getHalfHeight(), 50, 50, scene1.getCanvas()));
        scene1.add(sprite1);
        
        Scene scene2 = new Scene(game);
        // Scene scene2 = new Scene("scene2", game); [Give the scene a more accessible name]
        Sprite sprite2 = new Sprite(new FilledRect(scene2.getHalfWidth(), scene2.getHalfHeight(), 50, 50, scene2.getCanvas()));
        scene2.add(sprite2);
        
        game.addScene(scene1);
        game.addScene(scene2);
        // game.addScenes([scene1, scene2]);
        
        game.setScene("scene1");
        // game.setScene(scene1); // Changes the scene, but isn't static like the others (dynamic). 
        // This is used 10x more often than the aforementioned method.
    }
}