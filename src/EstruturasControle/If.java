package EstruturasControle;


import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        //ESTRUTURA do IF precisa estar entre parenteses seguido de um {} Semopre retorna um Booleano
        Scanner inp = new Scanner(System.in);

        System.out.println("Digite a média: ");
        double media = inp.nextDouble();

        if (media <=10 && media >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");}


        /* Maneira de fazer String virar inteiro
        String valor;
        int numero = Interger.parseInt(valor);  */


        inp.close();
        }







        }





