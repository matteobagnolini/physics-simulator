package SineWaves;

import Graphics.Plot;

public class UseSingleWave {

    public static void main(String[] args) {
        Wave simpleWave = new SingleWave();
        simpleWave.initMap(0, Math.PI * 4);
        Plot myPlot = new Plot("Sine wave",0,14,1,-2,2,0.5);
        for (var point : simpleWave.getMap().entrySet()) {
            myPlot.addPoint(point.getKey(), point.getValue());
        }
    }
}
