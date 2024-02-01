package RangeOfProjectile;

import Graphics.Plot;

public class UseRangeCalc {

    public static void main(String[] args) {
        RangeCalc rc = new RangeCalc();
        Plot myPlot = new Plot("Plot of meters vs. degree",0,100,5,-5,50,2.5);
        rc.setSpeed(20);

        for(double angle = 0; angle<= 90; angle += 0.5) {
            rc.setAngle(angle);
            System.out.println("Using angle = " + angle);
            System.out.println("Range = " + rc.range() + " meters");
            System.out.println("Max height: " + rc.height() + " meters");
            System.out.println("##########################");
            myPlot.addPoint(angle, rc.range());
        }
    }


}
