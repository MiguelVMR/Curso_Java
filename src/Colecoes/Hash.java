package Colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet <Usuarios> usuarios = new HashSet<>();

        usuarios.add(new Usuarios("Pedro"));
        usuarios.add(new Usuarios("Ana"));
        usuarios.add(new Usuarios("Guilherme"));

        System.out.println(usuarios.contains(new Usuarios("Guilherme")));











    }
}
