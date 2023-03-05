package oo.Heranca.Desafio;

public class Ferrari extends Carro{

   public Ferrari(){
        this(315);
    }

   public Ferrari (int velocicadeMAX){
        super(velocicadeMAX);
        delta = 15;
    }
//    @Override
//    void acelerar() {
//        velocidadeAtual +=15;
//    }
}
