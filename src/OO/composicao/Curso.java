package oo.composicao;

import java.util.ArrayList;
import java.util.List;

import oo.composicao.Aluno;

public class Curso {
     final String nome;
    final List<Aluno> alunos = new ArrayList<>();
    Curso(String nome){
        this.nome = nome;
    }

    void AdcionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);


    }


}
