package ArryCollections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Quantos alunos ? ");
        int qtdAulnos = inp.nextInt();

        System.out.println("Quantos notas por aluno ? ");
        int qtdNotas = inp.nextInt();

        double[][] notasDaTurma = new double[qtdAulnos][qtdNotas];
        double total = 0;

        for (int a = 0; a < notasDaTurma.length;a++){
            for (int n = 0; n < notasDaTurma[a].length;n++){
            System.out.printf("Informe a nota %d do aluno %d: ",(n + 1),(a + 1)  );
            notasDaTurma[a][n] = inp.nextDouble();
            total += notasDaTurma[a][n];

        }
    }

    double media = total/ (qtdAulnos * qtdNotas);
        System.out.println("Média da turma é: " + media);




    inp.close();

    }
}
