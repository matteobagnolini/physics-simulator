package SineWaves;

import java.util.ArrayList;
import java.util.List;

import Graphics.Plot;

public class UseWaves {

    public static void main(String[] args) {
        Wave simple = new SingleWave();
        Wave compl = new ComplexWave();
        Wave fourier = new FourierWave(5000);
        Wave fourier2 = new FourierWave2(5000);

        List<Wave> waves = new ArrayList<>();
        waves.add(simple);
        waves.add(compl);
        waves.add(fourier);
        waves.add(fourier2);

        for(var wave : waves) {
            wave.initMap(0, Math.PI * 4);
            Plot myPlot = new Plot("Wave",0,14,1,-2,2,0.5);
            for(var dots : wave.getMap().entrySet()) {
                myPlot.addPoint(dots.getKey(), dots.getValue());
            }
        }

    }
}
