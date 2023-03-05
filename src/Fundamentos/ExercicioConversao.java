package Fundamentos;

import java.util.Scanner;

public class ExercicioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro salário");
        String s1 = input.nextLine().replace(",",".");

        System.out.println("Digite o segundo salário");
        String s2 = input.nextLine().replace(",",".");

        System.out.println("Digite o terceiro  salário");
        String s3 = input.nextLine().replace(",",".");

        double sal1 = Double.parseDouble(s1);
        double sal2 = Double.parseDouble(s2);
        double sal3 = Double.parseDouble(s3);

        double med = (sal1 + sal2 + sal3)/3;
        System.out.println("A média dos seus salrios é: " + med);



        input.close();


















    }
}
