package SineWaves;

import java.util.Map;

public interface Wave {

    void initMap(double start, double end);
    
    Map<Double, Double> getMap();

}
