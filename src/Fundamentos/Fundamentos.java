package Fundamentos;


import java.util.Scanner;

/**
 * JAVADOC
 *
 * @author Miguel Vilela Moraes Ribeiro <@email.com>
 * @since 1.0
 */
public class Fundamentos {
    public static void main(String[] args) {
        int num = 3;
        double numm = 1.5;

        // final antes das variaveis para ela se tornar uma constante
        final double CONSTANTE = 3.1415;

        // var infere o tipo da variavel
        var text = "string";
        text = "Outra string";

        // inout em java
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        int idade = input.nextInt();
        input.close();

    /* Wrapers são a versão objeto dos tipos primitivos (Podem colocar ponto e alguma coisa )
    Byte
    Short
    Interger
    Long tem que por o l no final (Long a = 100l;)
    Boolean
    Character
    Float colocar f no final
    Double
    */
        //CAST

        int c = 4;
        byte d = (byte) c; // conversão explisita

        Integer i = 100;
        i.toString();
        /* usa o ponto toString para transformar o numero para string obs os tipos primitivos
        não tem como precisam ser wrapers */

        // para transformar string em numero usa o ponto parse (.parseDouble)
        String texto = "TEXTO";
        double i1 = Double.parseDouble(texto);

        // sobre operadores de condição && (AND) || (OR)

        /*Operador XOR (^) tabela
        T ^ T = false
        T ^ F = true
        F ^ T = true
        F ^ F = false */
        // Acrecentar o valor de uma variavel operador ( +=) a += b é a mesma coisa que a = a + b (funciona com - / * )

        // operador ternário o ? separa a que vai ser analizado a expressão e o : divde falso e verdadeiro
        double nota = 9.3;
        String result = nota >= 7.0 ? "Aprovado" : "Reprovado"; // exemplo de operador ternário (parecido com if)
        // Iguadade de strings usar a função equals em vez de ==
        String e1 = new String("2");
        System.out.println("2".equals(e1.trim())); //Existe o equalsIgnoreCase que ignora letras maiusculos e minusculas





    }
}
