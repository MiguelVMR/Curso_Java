package Classe;

public class Data {
    int dia;
    int mes;
    int ano;
    

    Data (){
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1,1,1970);

    }
    Data (int dia,int mes,int ano){
        this.dia = dia; // usa This para referenciar o obj que esta sendo criado na classe
        this.mes = mes; // Desta forma não gerar conflito ao usar o mesmo nome do obj como parametros do construtor
        this.ano = ano; // não pode usar this em um contexto static

    }



    String obterDataFormatada(){

        return String.format("%d/%d/%d",dia,mes,ano);

    }
    void imprimirDataFomatada(){ // Não é comum usar o sout pois limita p leque de opções para usar pois é somente em terminal

        System.out.println(obterDataFormatada());

    }

}
