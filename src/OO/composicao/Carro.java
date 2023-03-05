package oo.composicao;

public class Carro {
   final Motor motor;
    Carro (){

        this.motor = new Motor(this);
    }

    void acelerar (){
        if(motor.fatorIjecao < 2.6){
        motor.fatorIjecao += 0.4;}
    }

    void frear (){
       if (motor.fatorIjecao >0.5){
        motor.fatorIjecao -= 0.4;}
    }

    void ligar(){
        motor.ligado = true;

    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaligado (){
        return motor.ligado;
    }

}
