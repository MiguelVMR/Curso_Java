package Classe;

public class Equals {
    public static void main(String[] args) {
        Usuarios u1 = new Usuarios();
        u1.nome = "Miguel Vilela";
        u1.email = "miguelmvi@gmail.com";

        Usuarios u2 = new Usuarios();
        u2.nome = "Miguel Vilela";
        u2.email = "miguelmvi@gmail.com";
        System.out.println(u1 == u2);

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
