# ObjectDrawPro
---

## About
ObjectDrawPro is an extension engine of the original objectdraw engine, which runs off of Java. ObjectDraw is commonly used for beginner Java Programming classes, and has very little real-world solution uses.

ObjectDrawPro utilizes ObjectDraw and expands it to include advanced rotation, collisions, physics, and scenes. It is basically for that one student in your class who knows how to code already, and wants some things to fiddle and mess around with. At least that's what I made it for...

## Usage
You can use this library by importing it (along with objectdraw).

### Basic
```
import objectdraw.*;
import ObjectDrawPro.*;
import java.awt.*;

public class MyGame {
  public static void main(String[] args) {
    Game game = new Game(800, 600);
    
    game.addStartListener(
      () -> begin()
    );
    
    game.addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent event) {
        System.out.println(event.getKeyChar());
      }
    });
    
    game.addMouseListener(new MouseListener() {
      public void onMousePress(Location point) {
        System.out.println(point);
      }
    });
  }
  
  public void begin() {
    // Code
  }
}
```
