package SineWaves;

import Graphics.Plot;

public class UseWaves {

    public static void main(String[] args) {
        Wave simple = new SingleWave();
        Wave compl = new ComplexWave();
        Wave fourier = new FourierWave(500);
        simple.initMap(0, Math.PI * 4);
        compl.initMap(0, Math.PI * 4);
        fourier.initMap(0, Math.PI * 4);
        Plot myPlot1 = new Plot("Sine wave",0,14,1,-2,2,0.5);
        Plot myPlot2 = new Plot("Complex wave",0,14,1,-2,2,0.5);
        Plot myPlot3 = new Plot("Fourier wave",0,14,1,-2,2,0.5);
        for (var point : simple.getMap().entrySet()) {
            myPlot1.addPoint(point.getKey(), point.getValue());
        }
        for (var point : compl.getMap().entrySet()) {
            myPlot2.addPoint(point.getKey(), point.getValue());
        }
        for (var point : fourier.getMap().entrySet()) {
            myPlot3.addPoint(point.getKey(), point.getValue());
        }
    }
}
