package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque <String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe"); // Retorna verdadeiro ou falso se pilha cheia
        livros.push("Don Quixote");// Retorna exeção se pilha cheia
        livros.add("O Hobbit");


        //Funcionam igual a lista mas com a diferença que mexem nos ultimos elemntos primeiro
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.pop());
        System.out.println(livros.remove());
        System.out.println(livros.poll());



















    }
}
