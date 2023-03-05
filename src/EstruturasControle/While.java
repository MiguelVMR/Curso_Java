package EstruturasControle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //ESTRUTURA do WHILE (Expressão) como o if retorna true ou false
          /*int cont = 1;
        while (cont <= 10) {
            System.out.printf(" i %d \n", cont);
            cont++;}   */
        Scanner inp = new Scanner(System.in);
        System.out.println("Digiter sair para sair");
        String sair = " ";

        while (!sair.equalsIgnoreCase("sair")) {
            System.out.println("Voce Diz : ");
             sair = inp.nextLine();

        }


        inp.close();














    }
    }
