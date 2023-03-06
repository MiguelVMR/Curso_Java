package oo.polimorfismo;

public class pessoa {
    private double peso;

    public pessoa (double peso){
        setPeso(peso);
    }

    public void comer(comida comida){
        this.peso += comida.getPeso();
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
       if(peso >= 0){
           this.peso = peso;
        
       }
    }

    
}
