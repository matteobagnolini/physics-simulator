package SineWaves;

public class FourierWave2 extends AbstractWave {

    private final int terms;

    FourierWave2(int k) {
        this.terms = k;
    }
    
    @Override
    protected double waveFunction(double rad) {
        double result = 0;
        for(int k = 1; k <= terms; k+=2) {
            result += Math.sin(k * rad) / k;
        }
        return result;
    }


}
