package ObjectDrawPro;


/**
 * Write a description of class Rotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rotation {
    public double angle;
    
    Rotation() {
        angle = 0;
    }
    
    Rotation(double newAngle) {
        angle = newAngle;
    }
    
    public double getAngle() {
        return angle;
    }
    
    public void setAngle(double newAngle) {
        angle = newAngle;
    }
}