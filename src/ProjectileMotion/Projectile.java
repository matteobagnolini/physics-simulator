package ProjectileMotion;

import java.util.Map;
import java.util.TreeMap;

public class Projectile {

    private final double dt = 0.001;                        //modify to change the refresh rate
    private double vy;
    private double y;
    private double ay;
    private double t = 0;
    private final double drag = 0.1;                          //modify to make the drag stronger or weaker
    private final Map<Double, Double> motion = new TreeMap<>();

    Projectile(final double ay, final double vy, final double y) {
        this.y = y;
        this.vy = vy;
        this.ay = ay;
    }

    public void computeMotion() {
        while(y > 0) {
            ay = -9.8 - drag * Math.abs(vy) * vy;
            vy += ay * dt;
            y += vy * dt;
            t += dt;
            System.out.println("y: " + y);
            System.out.println("ay: " + ay);
            motion.put(t, y);
        }
    }

    public Map<Double, Double> getMotion() {
        return this.motion;
    }

}
