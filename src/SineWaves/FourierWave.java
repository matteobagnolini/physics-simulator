package SineWaves;

public class FourierWave extends AbstractWave {

    private final int terms;

    FourierWave(int k) {
        this.terms = k;
    }
    
    @Override
    protected double waveFunction(double rad) {
        double result = 0;
        for(int i = 1, k = 1; i <= terms; i++, k+=2) {
            result += Math.sin(k * rad) / k;
        }
        return result;
    }

}
