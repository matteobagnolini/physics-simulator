package SineWaves;

public class ComplexWave extends AbstractWave {

    @Override
    protected double waveFunction(double rad) {
        return Math.sin(rad) + Math.sin(3*rad)/3;
    }

}
