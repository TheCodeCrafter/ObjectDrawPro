import objectdraw.*;
import java.awt.*;
import ObjectDrawPro.*;

public class BasicSprite {
    
    private Game game;
    
    public static void main(String[] args) {
        game = new Game(800, 600);
        
        // If you don't add the sprite to the scene, it won't be rotated properly, or have physics/collisions applied to it
        Sprite sprite = new Sprite(new FilledOval(10, 10, 10, 10, game.getCurrentScene().getCanvas()));
        game.getCurrentScene().add(sprite);
    }
}