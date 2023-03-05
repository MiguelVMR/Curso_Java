package EstruturasControle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // EXTRUTURA Do While temos o Do {sentença de cod} While (Esxpressão);
        // Termina com ponto e virgula
        // Diferente do While comum que pode não ser executada nenhuma vez, esta executa 1 vez pelo menos
        Scanner inp = new Scanner(System.in);
        String texto = "";
        do {

            System.out.println("Voce precisa falar as palavras mágicas");
            System.out.println("Quer sair? ");
            texto = inp.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado");




        inp.close();





    }
}
