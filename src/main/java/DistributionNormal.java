
import org.apache.commons.math3.distribution.RealDistribution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class DistributionNormal implements RadomAdapter{
    RealDistribution normalRandom = new org.apache.commons.math3.distribution.NormalDistribution();
    private int seed;
    public DistributionNormal(int seed) {
        this.seed=(int)seed;
    }

        

    @Override
    public double numbers() {
        normalRandom.reseedRandomGenerator(seed);
        return normalRandom.sample();
    }


    @Override
    public double[] numbersConjunto(int seed) {
        normalRandom.reseedRandomGenerator(seed);
        return normalRandom.sample(seed);
    }
    


}
