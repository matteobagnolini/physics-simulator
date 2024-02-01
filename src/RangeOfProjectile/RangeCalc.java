package RangeOfProjectile;

public class RangeCalc {

    
    
    RangeCalc(double speed, double angleInDegrees) {
        double g, angleInRads, range;
        g = 9.81;
        angleInRads = angleInDegrees * Math.PI / 180;
        range = 2 * speed * speed * 
            Math.sin(angleInRads) * Math.cos(angleInRads) / g;
        System.out.println("Range = " + range + " meters");
    }

    public static void main(String[] args) {
        new RangeCalc(20, 45);
    }

}
