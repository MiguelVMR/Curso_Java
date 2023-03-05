package EstruturasControle;

import java.util.Scanner;

public class ExercicioPalavra {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = inp.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }





















        inp.close();


























    }
}
