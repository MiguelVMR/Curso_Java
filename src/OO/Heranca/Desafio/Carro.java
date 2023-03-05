package oo.Heranca.Desafio;

public class Carro {
     int velocidadeAtual;
     final int VELOCIDADE_MAXIMA;
     int delta = 5;

     protected Carro(int velocidadeMAX){
         VELOCIDADE_MAXIMA  = velocidadeMAX;
     }

    public void acelerar (){
            if (velocidadeAtual + delta > VELOCIDADE_MAXIMA){
           velocidadeAtual = VELOCIDADE_MAXIMA; }
            else{
        velocidadeAtual += delta;}
    }
    public void frear (){
        if(velocidadeAtual >= delta) {
            velocidadeAtual -= delta;

        }else {
            velocidadeAtual = 0;
        }

    }
    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + "Km/h";
    }
}
