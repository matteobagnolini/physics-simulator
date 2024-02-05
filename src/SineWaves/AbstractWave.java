package SineWaves;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractWave implements Wave {
    
    private final Map<Double, Double> map = new HashMap<>();

    public void initMap(double start, double end) {
        for(double rad = start; rad <= Math.PI * 4; rad += Math.PI/50) {
            this.map.put(rad, waveFunction(rad));
        }
    }
    
    public Map<Double, Double> getMap() {
        return this.map;
    }

    abstract protected double waveFunction(double rad);
}
