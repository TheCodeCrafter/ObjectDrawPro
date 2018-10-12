package ObjectDrawPro;

import objectdraw.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

import ObjectDrawPro.Rigidbody;
import ObjectDrawPro.Collider;

/**
 * Basic catcher for all object types, including images.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Sprite {
    
    private Resizable2DInterface object;
    private Scene scene;
    
    // ROTATION
    private Rotation rotation;
    
    /* First Constructor for basic objects */
    Sprite(Resizable2DInterface newObject, Scene addScene) {
        object = newObject;
        rotation = new Rotation();
        
        scene = addScene;
        
        this.addToScene(scene);
    }
    
    /* Second Constructor to catch image inputs */
    Sprite(String path, int x, int y, double width, double height, DrawingCanvas canvas) {
        BufferedImage image;
        
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            image = null;
        }
        
        object = new VisibleImage(image, x, y, width, height, canvas);
    }
    
    // Get entire object
    public Resizable2DInterface getObject() {
        return object;
    }
    
    // Set entire object
    public void setObject(Resizable2DInterface in) {
        object = in;
    }
    
    /////////////////////////////////////////////////////////////////////////
    /// GETTERS /////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    
    // LOCATION //////////////////////
    public double getX() {
        return object.getX();
    }
    
    public double getY() {
        return object.getY();
    }
    
    public Location getLocation() {
        return object.getLocation();
    }
    //////////////////////////////////
    
    // SIZE ///////////////////////////////////////
    public double getWidth() {
        return object.getWidth();
    }
    
    public double getHeight() {
        return object.getHeight();
    }
    
    public double getHalfWidth() {
        return (object.getWidth()/2);
    }
    
    public double getHalfHeight() {
        return (object.getHeight()/2);
    }
    
    public Object getSize() {
        Size size = new Size(object.getWidth(), 
                            object.getHeight());
        return size;
    }
    ////////////////////////////////////////////////
    
    // Color and MISC //////////////////////////////
    public Color getColor() {
        return object.getColor();
    }
    
    public int getRed() {
        return object.getColor().getRed();
    }
    
    public int getGreen() {
        return object.getColor().getGreen();
    }
    
    public int getBlue() {
        return object.getColor().getBlue();
    }
    
    /*
    public DrawingCanvas getCanvas() {
        return object.getCanvas();
    }
    */
    
    public Scene getScene() {
        return scene;
    }
    
    public boolean isHidden() {
        return object.isHidden();
    }
    
    public boolean overlaps(Drawable2DInterface in) {
        return object.overlaps(in);
    }
    
    public boolean contains(Location l) {
        return object.contains(l);
    }
    /////////////////////////////////////////////////////
    
    /////////////////////////////////////////////////////////////////////////
    /// SETTERS /////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    
    // Location /////////////////////////////////////
    public void setX(int newX) {
        object.moveTo(newX, object.getY());
    }
    
    public void setY(int newY) {
        object.moveTo(object.getX(), newY);
    }
    
    public void setLocation(double newX, double newY) {
        object.moveTo(newX, newY);
    }
    
    public void moveTo(double newX, double newY) {
        object.moveTo(newX, newY);
    }
    
    public void move(double mX, double mY) {
        object.move(mX, mY);
    }
    
    public void translate(double tX, double tY) {
        object.getLocation().translate(tX, tY);
    }
    //////////////////////////////////////////////////////////
    
    // Size //////////////////////////////////////////////////
    public void setWidth(int newWidth) {
        object.setWidth(newWidth);
    }
    
    public void setHeight(int newHeight) {
        object.setHeight(newHeight);
    }
    
    public void setSize(int newWidth, int newHeight) {
        object.setWidth(newWidth);
        object.setHeight(newHeight);
    }
    ////////////////////////////////////////////////////
    
    // Color ///////////////////////////////////////////
    public void setColor(Color newColor) {
        object.setColor(newColor);
    }
    
    public void setColor(int red, int green, int blue) {
        object.setColor(new Color(red, green, blue));
    }
    
    public void setRed(int newRed) {
        object.setColor(new Color(newRed, object.getColor().getGreen(), object.getColor().getBlue()));
    }
    
    public void setGreen(int newGreen) {
        object.setColor(new Color(object.getColor().getRed(), newGreen, object.getColor().getBlue()));
    }
    
    public void setBlue(int newBlue) {
        object.setColor(new Color(object.getColor().getRed(), object.getColor().getGreen(), newBlue));
    }
    /////////////////////////////////////////////////////
    
    // MISC /////////////////////////////////////////////
    /*
    public void addToCanvas(DrawingCanvas canvas) {
        object.addToCanvas(canvas);
    }
    */
    
    public void addToScene(Scene scene) {
        scene.add(this);
    }
    
    public void hide() {
        object.hide();
    }
    
    public void show() {
        object.show();
    }
    
    public void delete() {
        // object.removeFromCanvas();
        scene.remove(this);
    }
    
    public void remove() {
        // object.removeFromCanvas();
        scene.remove(this);
    }
    
    /*
    public void removeFromCanvas() {
        object.removeFromCanvas();
    }
    */
   
    public void removeFromScene() {
        scene.remove(this);
    }
    
    public void sendBackward() {
        object.sendBackward();
    }
    
    public void sendForward() {
        object.sendForward();
    }
    
    public void sendToBack() {
        object.sendToBack();
    }
    
    public void sendToFront() {
        object.sendToFront();
    }
    /////////////////////////////////////////////////
    
    /// PHYSICS ///
    Collider collider;
    Rigidbody rigidbody;
    
    boolean hasRigidbody = false;
    boolean hasCollider = false;
    
    public void addCollider(Collider newCollider) {
        collider = newCollider;
        hasCollider = true;
    }
    
    public void removeCollider() {
        collider = null;
        hasCollider = false;
    }
    
    public void enableCollider() {
        hasCollider = true;
    }
    
    public void disableCollider() {
        hasCollider = false;
    }
    
    public Collider getCollider() {
        return collider;
    }
    
    public void addRigidbody(Rigidbody newRigidbody) {
        rigidbody = newRigidbody;
        hasRigidbody = true;
    }
    
    public void removeRigidbody() {
        rigidbody = null;
        hasRigidbody = false;
    }
    
    public void enableRigidbody() {
        hasRigidbody = true;
    }
    
    public void disableRigidbody() {
        hasRigidbody = false;
    }
    
    public Rigidbody getRigidbody() {
        return rigidbody;
    }
    
    // TODO: Add further implementation
    
    ////// HELPER CLASSES ///////
    public class Size {
        
        double width = 0;
        double height = 0;
        
        Size(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }
}

/**
 * Usage:
 * Sprite sprite = new Sprite(new FilledOval(x, y, width, height, scene.getCanvas()));
 */