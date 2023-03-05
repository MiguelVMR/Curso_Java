package OO.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
     final String nome;
   final List <compra> compras = new ArrayList<>();
    Cliente (String nome){
        this.nome = nome;
    }
    void addcompra(compra compra){
        this.compras.add(compra);
    }

    double obterVtotal(){
        double total = 0;
        for(compra compra:compras){
            total += compra.obterVtotal();
        }

        return total;


    }
}
