package OO.Heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro =  new Monstro();
         monstro.x = 10;
         monstro.y = 10;
         heroi heroi =  new heroi(10,11);



        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Herói tem => " +heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Herói tem => " +heroi.vida);
        System.out.println("Monstro tem => " + monstro.vida);



//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.LESTE);
//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.LESTE);
//
//        System.out.println(monstro.x);
//        System.out.println(monstro.y);




    }
}
