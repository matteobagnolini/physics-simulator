package ProjectileMotion;

import java.util.Map;
import java.util.TreeMap;

public abstract class Projectile {

    protected static final double g = 9.81;

    protected final double dt = 0.001;                        //modify to change the refresh rate
    protected double t = 0;
    protected final double drag = 0.01;                          //modify to make the drag stronger or weaker
    protected final Map<Double, Double> motion = new TreeMap<>();
    protected final Map<Double, Double> velocity = new TreeMap<>();

    /* it implements the Euler-Richardson algorithm that compute ymid, vymid and aymid
     * to calculate y, vy and ay in a more precise way 
     */
    abstract public void computeMotion();

    public Map<Double, Double> getMotion() {
        return this.motion;
    }

    public Map<Double, Double> getVelocity() {
        return this.velocity;
    }

}
