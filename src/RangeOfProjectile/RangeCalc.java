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

    public static void main(String[] args) {
        RangeCalc rc = new RangeCalc();
        rc.setSpeed(15);
        for(double angle = 0; angle<= 90; angle += 5) {
            rc.setAngle(angle);
            System.out.println("Using angle = " + angle);
            System.out.println("Range = " + rc.range() + " meters");
            System.out.println("Max height: " + rc.height() + " meters");
            System.out.println("##########################");
        }
    }

}
