package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map <Integer, String> usuarios = new HashMap<>();

        // Nos MAP o put adciona elementos
        //Casa haja um dos elementos iguais ele substitui
        usuarios.put(1,"Ricardo");
        usuarios.put(2,"Roberto");
        usuarios.put(3,"Rafaela");
        usuarios.put(4,"Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet()); // Retorna so a primeira coluna (Chaves)
        System.out.println(usuarios.values()); // Retorna so a segunda coluna (Valores)
        System.out.println(usuarios.entrySet()); // Retorna as duas
        // o contains tem que ser acompanhado de key ou value

        System.out.println(usuarios.get(3)); // Pega o valor atraves da chave

        // percorre os elementos da chave (Primeira coluna)
        for (int chave : usuarios.keySet()){
            System.out.println(chave);
        }
        // percorre os elementos dos valores (segunda coluna)
        for (String valores : usuarios.values()){
            System.out.println(valores);

        }
        //Percorre as duas colunas
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
            System.out.println(registro);
        }



    }

}
