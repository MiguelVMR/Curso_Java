package oo.Heranca.Teste;

import oo.Heranca.Desafio.Carro;
import oo.Heranca.Desafio.Civic;
import oo.Heranca.Desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic();

        Carro f1 = new Ferrari(400);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        c1.frear();
        f1.frear();
        f1.frear();





        System.out.println(f1 + " --Ferrari " );
        System.out.println(c1 + " --Civic ");



    }
}
