package OO.Heranca.Desafio;

public class Ferrari extends Carro{

    Ferrari(){
        this(315);
    }

    Ferrari (int velocicadeMAX){
        super(velocicadeMAX);
        delta = 15;
    }
//    @Override
//    void acelerar() {
//        velocidadeAtual +=15;
//    }
}
