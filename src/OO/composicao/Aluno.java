package OO.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;
    final List<Curso> cursos = new ArrayList<>(); // Ainda pode alterar os elementos da lista, mas não seu endereço de momória

    Aluno(String nome){
        this.nome = nome;
    }

    void AdicionarCursos(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    Curso obterCursoPorNome(String nome){
        Curso procurado = null;
        for (Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }

        return procurado;
    }




     public String toString(){
        return nome;
    }



}
