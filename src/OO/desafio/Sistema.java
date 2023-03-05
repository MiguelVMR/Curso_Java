package OO.desafio;


public class Sistema {
    public static void main(String[] args) {

        compra compra1 = new compra();
        compra1.additem("Caneta",1,100);
        compra1.additem(new Produto("Notebook",2000),2);
        compra compra2 = new compra();
        compra2.additem("Caderto",10,10);
        compra2.additem(new Produto("Impressora",1000),1);

        Cliente cliente = new Cliente("Maria");
        cliente.addcompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterVtotal());



    }
}
