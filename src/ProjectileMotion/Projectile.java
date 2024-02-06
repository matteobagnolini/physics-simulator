package ProjectileMotion;

import java.util.Map;
import java.util.TreeMap;

public class Projectile {

    private final double dt = 0.01;
    private double vy;
    private double y;
    private double ay;
    private double t = 0;
    private final Map<Double, Double> motion = new TreeMap<>();

    Projectile(final double ay, final double vy, final double y) {
        this.y = y;
        this.vy = vy;
        this.ay = ay;
    }

    public void computeMotion() {
        while(y > 0) {
            ay = ay;
            vy += ay * dt;
            y += vy * dt;
            t += dt;

            motion.put(t, y);
        }
    }

    public Map<Double, Double> getMotion() {
        return this.motion;
    }

}
