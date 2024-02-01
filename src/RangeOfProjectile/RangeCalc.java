package RangeOfProjectile;


/**
 * 
 */
public class RangeCalc {

    private static double G = 9.81;
    private double angleInRads;
    private double v0;

    /* Compute the maximum height of the projectile */
    public double height() {
        return (v0*Math.sin(angleInRads))*(v0*Math.sin(angleInRads)) / 2*G;
    }

    /* Compute the range of the projectile */
    public double range() {
        return 2 * v0 * v0 * 
            Math.sin(angleInRads) * Math.cos(angleInRads) / G;
    }

    public void setSpeed(final double speed) {
        this.v0 = speed;
    }

    public void setAngle(final double angle) {
        this.angleInRads = Math.toRadians(angle);
    }

}
