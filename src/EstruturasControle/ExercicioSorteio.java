package EstruturasControle;

import java.util.Scanner;

public class ExercicioSorteio {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = 47;
        int contador = 10;
        for (int i = 10; i > 0; i--){
            System.out.println("Digite seu palpite numero ?");
            int numd = inp.nextInt();
            if (num == numd){
                System.out.println("Parabéns voce ganhou!!");
                System.out.printf("Ainda restam %d tentativas", contador);
                break;
            }else if (num != numd){
                contador--;
                System.out.printf("Voce errou faltam %d tentativas\n", contador);}


                if(numd < num){
                    System.out.println("O numero digitado é menor que o numero secreto. ");
                }else if (numd > num){
                    System.out.println("O numero digitado é maior que o numero secreto. ");}


                if (contador == 0){
                    break;
                }








        }




        inp.close();


    }
}
