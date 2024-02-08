package ProjectileMotion;

import java.util.Map;
import java.util.TreeMap;

public class Projectile1D extends Projectile {

    private double vy;
    private double y;
    private double ay;

    Projectile1D(final double ay, final double vy, final double y) {
        this.y = y;
        this.vy = vy;
        this.ay = ay;
    }

    /* it implements the Euler-Richardson algorithm that compute ymid, vymid and aymid
     * to calculate y, vy and ay in a more precise way 
     */
    public void computeMotion() {
        double vymid, aymid;
        while(y >= 0) {
            ay = -g - drag * Math.abs(vy) * vy;;
            vymid = vy + ay * 0.5 * dt;
            aymid = -g - drag * Math.abs(vymid) * vymid;
            y += vymid * dt;
            vy += aymid * dt;
            t += dt;
            motion.put(t, y);
            velocity.put(t,vy);
            System.out.println(y);
        }
    }

}
