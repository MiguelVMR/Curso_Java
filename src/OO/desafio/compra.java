package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class compra {
    final List <Item> itens = new ArrayList<>();

    void additem(Produto p , int quantidade){
        this.itens.add(new Item(p,quantidade));

    }
    void additem(String nome , double preco,int quantidade){
        this.itens.add(new Item(new Produto(nome,preco),quantidade));

    }
    double obterVtotal(){
        double total = 0;
        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }


        return total;
    }
}
