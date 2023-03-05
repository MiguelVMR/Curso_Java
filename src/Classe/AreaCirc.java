package Classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.14;

    AreaCirc(double raioInicial){ //construtor
        raio = raioInicial;


    }

    static double area(double raio){ // Metodo estático
        return raio * raio * PI;

    }
    double area(){ //metodo padrão

        return raio * raio * PI;
    }

}
