package EstruturasControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Vamos calcular a média das notas. ");
        int quantNota = 0;
        double notas = 0;
        double total = 0;


        while (notas != -1){
            System.out.println("Informe a nota ou -1 para sair : ");
            notas = inp.nextDouble();

            if (notas <= 10 && notas >= 0) {
                total += notas;
                quantNota++;
            }
            else if(notas != -1){
                System.out.println("Nota inválida");
            }
        }

        double media = total/quantNota;
        System.out.println("A média é = " + media);








    inp.close();

    }
}
