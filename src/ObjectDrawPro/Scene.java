package ObjectDrawPro;

import objectdraw.*;

import ObjectDrawPro.Physics;

import java.awt.*;
import java.util.*;

/**
 * Scene object. This is where we are going to apply any physics that are in
 * place as well as store all of the current objects.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Scene {
    
    DrawingCanvas canvas;
    ArrayList<Sprite> sprites = new ArrayList<Sprite>();
    
    Physics physics;
    
    Scene() {
        physics = new Physics();
    }
    
    Scene(DrawingCanvas tCanvas) {
        canvas = tCanvas;
    }
    
    Scene(Scene scene) {
        this.canvas = scene.canvas;
        this.sprites = scene.sprites;
    }
    
    public DrawingCanvas getCanvas() {
        return canvas;
    }
    
    public void add(Sprite sprite) {
        sprites.add(sprite);
        
        // Add the actual object to the canvas.
        sprite.getObject().addToCanvas(canvas);
    }
    
    public void remove(Sprite sprite) {
        sprites.remove(sprite);
    }
    
    // PHYSICS //
    public void addPhysics(Physics newPhysics) {
        physics = newPhysics;
    }
    
    public void setPhysics(Physics newPhysics) {
        physics = newPhysics;
    }
    
    public Physics getPhysics() {
        return physics;
    }
    
    // We call this function every frame.
    public void update() {
        sprites.forEach((sprite) -> {
            if(sprite.hasRigidbody) {
                sprite.getRigidbody().applyPhysics(physics);
            }
        });
    }
}