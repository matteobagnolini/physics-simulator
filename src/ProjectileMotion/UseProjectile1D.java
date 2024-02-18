package ProjectileMotion;

import Graphics.Plot;

public class UseProjectile1D {
    public static void main(String[] args) throws InterruptedException {
        Projectile1D pr = new Projectile1D(250, 10);          //modify to change parameters of the projectile
        pr.computeMotion();
        Plot myPlot = new Plot("time vs y", -1, 20, 1, -1, 200, 10);
        for (var points : pr.getMotion().entrySet()) {
            myPlot.addPoint(points.getKey(), points.getValue());
            //Thread.sleep(1);                             //modify to change speed of drawing points
            //myPlot.clearThePlot();                       //comment this line to see the full trajectory, and not just a point moving
        }

        Plot myPlot1 = new Plot("velocity", -1, 20, 1, -50, 200, 10);
        for (var points : pr.getVelocity().entrySet()) {
            myPlot1.addPoint(points.getKey(), points.getValue());
            
        }

    }
}
