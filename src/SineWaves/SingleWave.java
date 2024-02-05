package SineWaves;

/**
 * Simple class that draws the sine function in a plot
*/
public class SingleWave extends AbstractWave {

    @Override
    protected double waveFunction(double rad) {
        return Math.sin(rad);
    }

}
