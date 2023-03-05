package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Caracter

        System.out.println(conjunto.size()); //size para retornar quantos elementos tem

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste")); // remove itens do conjunto
        System.out.println(conjunto.size());

        System.out.println(conjunto.contains("Teste")); // Vereifica se o elemento esta contido ou não no conjunbto
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

       // conjunto.addAll(nums); // unir dois conjuntos
        conjunto.retainAll(nums); // interceção de  dois conjuntos

        conjunto.clear(); //Exclui todos os valores





    }
}
