package oo.Heranca.Desafio;

public class Carro {
     int velocidadeAtual;
     final int VELOCIDADE_MAXIMA;
     
     public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    private int delta = 5;

     protected Carro(int velocidadeMAX){
         VELOCIDADE_MAXIMA  = velocidadeMAX;
     }

    public void acelerar (){
            if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
           velocidadeAtual = VELOCIDADE_MAXIMA; }
            else{
        velocidadeAtual += getDelta();}
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
