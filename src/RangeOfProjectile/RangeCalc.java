package RangeOfProjectile;


/**
 * 
 */
public class RangeCalc {

    private static double G = 9.81;
    private double angleInRads;
    private double v0;

    RangeCalc(double speed, double angleInDegrees) {
        this.v0 = speed;
        this.angleInRads = Math.toRadians(angleInDegrees);
    }

    /* Compute the maximum height of the projectile */
    public double height() {
        return (v0*Math.sin(angleInRads))*(v0*Math.sin(angleInRads)) / 2*G;
    }

    /* Compute the range of the projectile */
    public double range() {
        return 2 * v0 * v0 * 
            Math.sin(angleInRads) * Math.cos(angleInRads) / G;
    }

    public static void main(String[] args) {
        RangeCalc rc = new RangeCalc(20, 30);
        System.out.println("Range = " + rc.range() + " meters");
        System.out.println("Max height: " + rc.height() + " meters");
    }

}
