package oo.composicao;

public class Motor {

   final Carro carro;
   boolean ligado = false;
    double fatorIjecao = 1;

    Motor (Carro carro){
        this.carro = carro;}

    int giros (){
        if (!ligado){return 0;}
        else {

        return (int) Math.round(fatorIjecao * 3000);}

    }

}
