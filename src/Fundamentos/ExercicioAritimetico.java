package Fundamentos;

public class ExercicioAritimetico {
    public static void main(String[] args) {
        int c1 = 6 * (3 + 2);
        int part1 = (int)Math.pow(c1,2);
        int div1 = 3 *2;
        int exp1 = part1 / div1;
        // conta 2 abaixo
        int c2 = (1 - 5) * (2 - 7)/2;
        int part2 =  (int)Math.pow(c2,2);


        int conta = (exp1 - part2);

        int dividendo = (int) Math.pow(conta,3);

        int divf = (int) Math.pow (10,3);

        System.out.println(dividendo / divf);







    }
}
