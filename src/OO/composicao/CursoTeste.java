package OO.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web completo");
        Curso curso3 = new Curso("React Native");

        curso1.AdcionarAluno(aluno1);
        curso1.AdcionarAluno(aluno2);

        curso2.AdcionarAluno(aluno1);
        curso2.AdcionarAluno(aluno3);

        aluno1.AdicionarCursos(curso3);
        aluno2.AdicionarCursos(curso3);
        aluno3.AdicionarCursos(curso3);


        for (Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso " + curso3.nome);
            System.out.println("...e o meu nome é " + aluno.nome);
            System.out.println();

        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");

        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
