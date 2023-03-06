package oo.polimorfismo;

public class jantar {
    public static void main(String[] args) {
        pessoa convidado = new pessoa (99.65);

        arroz ingrediente1 = new arroz (0.2);
        feijao ingrediente2 = new feijao(0.1);
        
        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        sorvete sobremesa =  new sorvete (0.45);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());








         


    }
    
}
