
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
public class ExponentialDistribution implements RadomAdapter{
    RealDistribution exponentialRandom = new org.apache.commons.math3.distribution.LogNormalDistribution();   
    private int seed;

    public ExponentialDistribution(long seed){
        this.seed=(int) seed;
    }

    @Override
    public double numbers() {
        
        return exponentialRandom.sample();
    }

    @Override
    public double[] numbersConjunto(int seed) {
        exponentialRandom.reseedRandomGenerator(seed);
        return exponentialRandom.sample(seed);
    }
    

   

}
