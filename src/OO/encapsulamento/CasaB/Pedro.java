package oo.encapsulamento.CasaB;

import oo.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    void  testesAcessos (){

        //System.out.println(mae.segredo);
        //System.out.println(mae.dentroDeCasa);
        System.out.println(formaDeFalar); // Quando vai acessar via herança não precisa instanciar
        System.out.println(todosSabem);
    }
}
