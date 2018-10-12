package ObjectDrawPro;

import objectdraw.*;
import java.awt.*;

import ObjectDrawPro.Physics;

/**
 * Used when you wish to apply gravity and friction to a sprite.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Rigidbody {
    
    private double mass;
    
    private double angularDrag;
    private double angularVelocity;
    
    private double centerOfMassX;
    private double centerOfMassY;
    
    private boolean collisionDetectionMode;
    
    private boolean constraintsX;
    private boolean constraintsY;
    
    private boolean constraintsRotation;
    
    private boolean detectCollisions;
    
    private double dragX;
    private double dragY;
    
    private boolean freezeRotation;
    
    private boolean interpolation;
    public boolean isKinematic;
    
    private double maxAngularVelocity;
    
    private double positionX;
    private double positionY;
    
    private Rotation rotation;
    
    private boolean useGravity;
    
    private double velocityX;
    private double velocityY;
    
    Rigidbody(Sprite sprite) {
        mass = 1;
        
        angularDrag = 0;
        angularVelocity = 0;
        
        centerOfMassX = sprite.getHalfWidth();
        centerOfMassY = sprite.getHalfHeight();
        
        collisionDetectionMode = true;
        
        constraintsX = false;
        constraintsY = false;
        
        constraintsRotation = false;
        
        detectCollisions = true;
        
        dragX = 0;
        dragY = 0;
        
        freezeRotation = false;
        
        interpolation = false;
        isKinematic = false;
        
        maxAngularVelocity = 0;
        
        positionX = sprite.getX();
        positionY = sprite.getY();
        
        rotation = new Rotation(0);
    }
    
    Rigidbody(Rigidbody rigidbody) {
        this.mass = rigidbody.getMass();
    }
    
    /// FUNCTIONAL METHODS ///
    
    public void applyPhysics(Physics physics) {
        // This is where we will calculate the positional and rotational
        // change that happens based on the current physical values.
        
        
    }
    
    //////////////////////////
    
    /// GETTERS ///
    
    public double getMass() {
        return this.mass;
    }
    
    public double getAngularDrag() {
        return this.angularDrag;
    }
    
    public double getAngularVelocity() {
        return this.angularVelocity;
    }
    
    public double getCOMX() {
        return this.centerOfMassX;
    }
    
    public double getCOMY() {
        return this.centerOfMassY;
    }
    
    public boolean getCollisionDetectionMode() {
        return this.collisionDetectionMode;
    }
    
    public boolean getConstraintsX() {
        return this.constraintsX;
    }
    
    public boolean getConstraintsY() {
        return this.constraintsY;
    }
    
    public boolean getConstraintsRotation() {
        return this.constraintsRotation;
    }
    
    public boolean isDetectingCollisions() {
        return this.detectCollisions;
    }
    
    public double getDragX() {
        return this.dragX;
    }
    
    public double getDragY() {
        return this.dragY;
    }
    
    public boolean isFrozenRotation() {
        return this.freezeRotation;
    }
    
    public boolean getInterpolation() {
        return this.interpolation;
    }
    
    public double getMaxAngularVelocity() {
        return this.maxAngularVelocity;
    }
    
    public Rotation getRotation() {
        return this.rotation;
    }
    
    public double getRotationAngle() {
        return this.rotation.angle;
    }
    
    public boolean usingGravity() {
        return this.useGravity;
    }
    
    public double getVelocityX() {
        return this.velocityX;
    }
    
    public double getVelocityY() {
        return this.velocityY;
    }
    
    ///////////////
    
    /// SETTERS ///
    
    public void setMass(double newMass) {
        mass = newMass;
    }
    
    public void setAngularDrag(double newDrag) {
        angularDrag = newDrag;
    }
    
    public void setAngularVelocity(double newAngVel) {
        angularVelocity = newAngVel;
    }
    
    public void setCOMX(double newCOMX) {
        centerOfMassX = newCOMX;
    }
    
    public void setCOMY(double newCOMY) {
        centerOfMassY = newCOMY;
    }
    
    public void setCollisionDetectionMode(boolean newCDM) {
        collisionDetectionMode = newCDM;
    }
    
    public void setConstraintsX(boolean newConstraintsX) {
        constraintsX = newConstraintsX;
    }
    
    public void setConstraintsY(boolean newConstraintsY) {
        constraintsY = newConstraintsY;
    }
    
    public void setConstraintsRotation(boolean newConstraintsRotation) {
        constraintsRotation = newConstraintsRotation;
    }
    
    public void setDetectsCollisions(boolean newDetectCollisions) {
        detectCollisions = newDetectCollisions;
    }
    
    public void setDragX(double newDragX) {
        dragX = newDragX;
    }
    
    public void setDragY(double newDragY) {
        dragY = newDragY;
    }
    
    public void setFreezeRotation(boolean newFreezeRot) {
        freezeRotation = newFreezeRot;
    }
    
    public void setInterpolation(boolean newInterpolation) {
        interpolation = newInterpolation;
    }
    
    public void setMaxAngularVelocity(double newMAV) {
        maxAngularVelocity = newMAV;
    }
    
    public void setRotation(Rotation newRotation) {
        rotation = newRotation;
    }
    
    public void setRotation(double angle) {
        rotation.setAngle(angle);
    }
    
    public void setUsesGravity(boolean newUseGravity) {
        useGravity = newUseGravity;
    }
    
    public void setVelocityX(double newVelX) {
        velocityX = newVelX;
    }
    
    public void setVelocityY(double newVelY) {
        velocityY = newVelY;
    }
    
    ///////////////
}