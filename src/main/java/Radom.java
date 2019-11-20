
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Radom implements RadomAdapter{
    private int seed;
    public Radom(int seed) {
        this.seed = seed;
    }

    Random random = new Random(seed);
     
    @Override
    public double numbers() {
       return  random.nextDouble();
    }

    @Override
    public double[] numbersConjunto(int seed) {
        double[] numeros = random.doubles(seed).toArray();
        return numeros;
    }

    

}
