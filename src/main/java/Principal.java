import org.apache.commons.math3.distribution.LogNormalDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;

import java.util.Random;

/**
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        /*Seed (semente) é o valor inicial a ser utilizado pelos geradores de números aleatórios.
        * Se for utilizada uma mesma seed ao executar a aplicação várias vezes, os
        * mesmos exatos valores serão gerados. Alterando a seed, a sequência de valores muda.
        */
        ;
        final long seed = 123;
        
         RadomAdapter radomAdapter;
        //Total de números a serem gerados em cada gerador
        final int TOTAL_NUMEROS = 4;
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            radomAdapter = new DistributionNormal((int) seed);
            System.out.println("Número aleatório seguindo distribuição Normal usando biblioteca Apache Commons Math: " + radomAdapter.numbersConjunto(12));
            radomAdapter = new ExponentialDistribution(seed);
            System.out.println("Número aleatório seguindo distribuição Exponencial usando biblioteca Apache Commons Math: " + radomAdapter.numbers());
            radomAdapter = new Radom((int) seed);
            System.out.println("Número aleatório seguindo distribuição Uniforme usando classe Random: " + radomAdapter.numbers());
            System.out.println();
        }
    }

}
