package ArryCollections;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 8;
        notasAlunoA [2] = 6.7;
        System.out.println( Arrays.toString(notasAlunoA));

        double totalAulunoA = 0;
        for (int i = 0; i < notasAlunoA.length;i++){ // percorrer o Array no for

            totalAulunoA += notasAlunoA[i];
        }
        System.out.println(totalAulunoA/ notasAlunoA.length);

        double totalAulunoB = 0;

        double[] notasAlunoB = {6.9,8.9,5.5,10};

        for  (int i = 0; i < notasAlunoB.length;i++){

            totalAulunoB += notasAlunoB[i];
        }
        System.out.println(totalAulunoB / notasAlunoB.length);


    }



}
