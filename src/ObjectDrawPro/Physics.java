package ObjectDrawPro;


/**
 * Used to implement basic gravity and rigidbody physics on a scene.
 *
 * @author TheCodeCrafter
 * @version 1.0
 */
public class Physics {
    
    public double gravityX;
    public double gravityY;
    
    public double friction;
    public double restitution;
    
    Physics() {
        gravityX = 0;
        gravityY = 0;
        
        friction = 0;
        restitution = 0;
    }
    
    Physics(double yGrav) {
        gravityY = yGrav;
        
        friction = 0;
        restitution = 0;
    }
    
    Physics(double gX, double gY) {
        gravityX = gX;
        gravityY = gY;
        
        friction = 0;
        restitution = 0;
    }
    
    Physics(double gX, double gY, double newFriction, double newRestitution) {
        gravityX = gX;
        gravityY = gY;
        
        friction = newFriction;
        restitution = newRestitution;
    }
    
    public double[] getGravity() {
        double[] gravity = {gravityX, gravityY};
        return gravity;
    }
    
    public double getGravityX() {
        return gravityX;
    }
    
    public double getGravityY() {
        return gravityY;
    }
    
    public double getFriction() {
        return friction;
    }
    
    public double getRestitution() {
        return restitution;
    }
    
    // SETTERS //
    public void setGravity(double gX, double gY) {
        gravityX = gX;
        gravityY = gY;
    }
    
    public void setGravityX(double gX) {
        gravityX = gX;
    }
    
    public void setGravityY(double gY) {
        gravityY = gY;
    }
    
    public void setFriction(double newFriction) {
        friction = newFriction;
    }
    
    public void setRestitution(double newRes) {
        restitution = newRes;
    }
    
}