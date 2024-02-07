package ProjectileMotion;

import java.util.Map;
import java.util.TreeMap;

public class Projectile {

    private static final double g = 9.81;

    private final double dt = 0.0001;                        //modify to change the refresh rate
    private double vy;
    private double y;
    private double ay;
    private double t = 0;
    private final double drag = 0.01;                          //modify to make the drag stronger or weaker
    private final Map<Double, Double> motion = new TreeMap<>();
    private final Map<Double, Double> velocity = new TreeMap<>();

    Projectile(final double ay, final double vy, final double y) {
        this.y = y;
        this.vy = vy;
        this.ay = ay;
    }

    public void computeMotion() {

        double ymid, vymid, aymid;
        while(y > 0) {
            /*
            ay = -g - drag * Math.abs(vy) * vy;
            vy += ay * dt;
            y += vy * dt;
            t += dt;
            motion.put(t, y);
            velocity.put(t,vy);
            */
            ay = -g - drag * Math.abs(vy) * vy;;
            ymid = y + vy * 0.5 * dt;
            vymid = vy + ay * 0.5 * dt;
            aymid = -g - drag * Math.abs(vymid) * vymid;
            y += vymid * dt;
            vy += aymid * dt;
            t += dt;
            motion.put(t, y);
            velocity.put(t,vy);
        }
    }

    public Map<Double, Double> getMotion() {
        return this.motion;
    }

    public Map<Double, Double> getVelocity() {
        return this.velocity;
    }

}
