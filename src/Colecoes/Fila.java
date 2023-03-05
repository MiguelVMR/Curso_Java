package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue <String> fila = new LinkedList<String>();
        // Tando add quanto offer adcionam elementos na fila

        fila.add("Ana"); // .add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); // .offer() retorna falso caso a fila esteja cheia.
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // peek e element servem para pegar elementos da fila (Sem remover)
        // diferença entre eles que se a fila esta vazia
        // peek retorna null e element retorna um erro
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        // poll e remove retorna o primeiro elemento da fila ja removendo
        // Se fila vazia poll retorna null e remove o erro de execão
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        // fila.size(); ver o tamanho
        // fila.clear(); limpa a fila
        // fila.isEmpty(); ver se a fila esta vazia
        // fila.contains(..) para ver se contem o elemento na fila


    }
}
