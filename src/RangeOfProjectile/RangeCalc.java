package RangeOfProjectile;

public class RangeCalc {

    private static double G = 9.81;
    private double range;

    RangeCalc(double speed, double angleInDegrees) {
        double angleInRads;
        angleInRads = Math.toRadians(angleInDegrees);
        range = 2 * speed * speed * 
            Math.sin(angleInRads) * Math.cos(angleInRads) / G;
    }

    public double range() {
        return this.range;
    }

    public static void main(String[] args) {
        RangeCalc rc = new RangeCalc(20, 90);
        System.out.println("Range = " + rc.range() + " meters");
    }

}
