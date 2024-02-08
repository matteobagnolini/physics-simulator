package ProjectileMotion;

import Graphics.Plot;

public class UseProjectile2D {
    public static void main(String[] args) throws InterruptedException {
        Projectile pr = new Projectile2D(45, 10, 20, 0);
        pr.computeMotion();
        Plot myPlot = new Plot("x vs y", -1, 50, 5, -1, 50, 5);
        for (var point : pr.getMotion().entrySet()) {
            myPlot.addPoint(point.getKey(), point.getValue());
            Thread.sleep(1);
            myPlot.clearThePlot();
        }

    }
}
