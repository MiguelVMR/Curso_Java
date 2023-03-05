package EstruturasControle;

import java.util.Scanner;

public class ExecicioMaiorNum {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int num = 0;
        int maior = 0;

        for (int i = 0; i <10; i++ ){
            System.out.println("Digite o valor ");
            num = inp.nextInt();
            if (num > maior ){
                maior =num;
            }

        }
        System.out.printf("O maior valor foi %d", maior);















        inp.close();


























    }
}
