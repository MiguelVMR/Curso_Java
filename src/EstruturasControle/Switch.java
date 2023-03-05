package EstruturasControle;



import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // ESTRUTURA do SWITCH dentro do parenteses recebe a expressão, depois vem os colchetes
        // depois vem os cases, case ... :
        Scanner inp = new Scanner(System.in);
        String conceito = "";
        System.out.println("Digite sua nota");
        int nota = inp.nextInt();

        switch (nota) {
            case 10: case 9: // Tem como por 2 cases na mesma linha para ter o mesmo resultado
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                conceito = "Não encontrado";

        }
        System.out.println("Conceito é : " + conceito);

        inp.close();

    }
}
