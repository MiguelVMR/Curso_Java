package Classe;

public class ValorVsRef {
    public static void main(String[] args) {

        double a =2;
        double b = a; // Atribuição por valor (Tipo primitivo)
        a++; // a = 3
        b--; // b = 1
        // Os valores são independentes
        System.out.println(b);
        
        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // Atribuição por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;
        int c =5;
        alterarPrimitivo(c);
        System.out.println(c);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        voltarData(d1);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());


    }

    static void voltarData (Data d){ // vai acessar a referencia de objeto ou seja ira gerar impacto
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;

    }
    static void alterarPrimitivo (int c){ // não ira gerar impacto pois gera acessa por atrbuição
        c++;
    }
}
