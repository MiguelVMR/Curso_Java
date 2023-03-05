package Classe;

public class Usuarios {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        if(objeto instanceof Usuarios) { // usa instaceof para comparar se é da mesma instancia(objeto)
            Usuarios outro = (Usuarios) objeto; // fazendo a conversão para usuário (Cast)
            boolean nomeIgual = outro.nome.equals(this.nome) ;
            boolean emaiIgual = outro.email.equals(this.email);
            return nomeIgual && emaiIgual;
        }else{
    return false;}


    }
}
