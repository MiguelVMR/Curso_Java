package Colecoes;


import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList <Usuarios> lista = new ArrayList<>();
        Usuarios u1 = new Usuarios("Ana");
        lista.add(u1);

        lista.add(new Usuarios("Pedro"));
        lista.add(new Usuarios("Lia"));
        lista.add(new Usuarios("Bia"));
        lista.add(new Usuarios("Manu"));

        System.out.println(lista.get(3)); //Acessar pelo indice
        System.out.println();

        lista.remove(1); //Remover apartir do indice
        lista.remove(new Usuarios("Manu"));

        System.out.println(lista.contains(new Usuarios("Lia"))); // Maneira de ver se o elemento ainda esta contido na lista

        for (Usuarios u : lista){
            System.out.println(u.nome);

        }

    }
}
