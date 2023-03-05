package EstruturasControle;

public class For {
    public static void main(String[] args) {
        // ESTRUTURA do FOR dentro do parenteses tem 3 partes separadas por ";"
        // temos variavel, Expressão, incremento
//        for (int cont = 0; cont <= 20 ; cont += 2){
//            System.out.printf("i = %d\n",cont); }
//        for (int cont = 10; cont >= 0 ; cont -= 2){
//
//            System.out.println(cont);
//        }
        // For dentro de For
        for ( int i = 0; i <10; i++){
            for(int j = 0; j < 10 ; j++){
                System.out.printf("[ %d , %d] ", i, j);
            }
            System.out.println();


        }











    }
}
