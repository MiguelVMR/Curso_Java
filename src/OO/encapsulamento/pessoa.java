package oo.encapsulamento;

public class pessoa {
    private int idade;
    private String nome;
    public pessoa (String nome ,int idade){
        setIdade(idade);
        setNome(nome);
    }

    // Getter - ler 
    public int getIdade(){
        return idade;
    }
    // Setter - altera 
    public void setIdade(int novaIdade){
       novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "Olá eu sou o " + getNome() + " tenho " + getIdade() + " anos.";
    }
}
