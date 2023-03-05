package oo.encapsulamento;

public class pessoaTeste {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("Pedro",-45);
        p1.setIdade(230);


        System.out.println(p1.getIdade()); // ler
        System.out.println(p1); // toString
    }
    
}
