package ArryCollections;


import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Quantas notas: ");
        int numNota = inp.nextInt();

        double[] notas =new double [numNota];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i + 1) + ": "  );
            notas [i] = inp.nextDouble();

        }

        for(double nota :notas){

            soma += nota;
        }

        double media = (soma/ notas.length);
        System.out.println("A média é " + media);











    inp.close();
    }
}
