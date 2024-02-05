package SineWaves;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple class that draws the sine function in a plot
*/
public class SingleWave implements Wave {

    private final Map<Double, Double> map = new HashMap<>();

    @Override
    public void initMap(double start, double end) {
        for(double rad = start; rad <= end; rad += Math.PI / 50) {
            map.put(rad, Math.sin(rad));
        }
    }

    @Override
    public Map<Double, Double> getMap() {
        return this.map;
    }

}
