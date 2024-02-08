package ProjectileMotion;

public class Projectile2D extends Projectile {
    private double ay, ax;
    private double vy, vx;
    private double y, x;

    Projectile2D(final double angle, final double v, final double y, final double x) {
        this.vy = v * Math.sin(Math.toRadians(angle));
        this.vx = v * Math.cos(Math.toRadians(angle));
        this.y = y;
        this.x = x;
    }

    @Override
    public void computeMotion() {
        while(y >= 0) {
            ay = -g - drag * Math.abs(vy) * vy;
            ax = -drag * Math.abs(vx) * vx;
            vy += ay * dt;
            vx += ax * dt;
            y += vy * dt;
            x += vx * dt;
            t += dt;
            motion.put(x, y);
            velocity.put(y, t);
        }
        
    }


}
