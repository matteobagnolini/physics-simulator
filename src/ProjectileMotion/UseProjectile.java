package ProjectileMotion;

import Graphics.Plot;

public class UseProjectile {
    public static void main(String[] args) throws InterruptedException {
        Projectile pr = new Projectile(-9.81, 50, 20);
        pr.computeMotion();
        Plot myPlot = new Plot("time vs y", -1, 20, 1, -1, 200, 10);
        for (var points : pr.getMotion().entrySet()) {
            myPlot.addPoint(points.getKey(), points.getValue());
            Thread.sleep(5);
            myPlot.clearThePlot();
        }
    }
}
