package model;

public class Mago extends Personagem{

    private int poderes;

    public Mago(String nome, int vidaMaxima, int poderes) {
        super(nome, vidaMaxima);
        this.poderes = poderes;



    }

    @Override
    public int atacar() {
        System.out.println();
        System.out.println("O mago" + getNome()+ "explode cahorro quente no mic");
        return this.poderes;
    }

    @Override
    public String toString() {
        return "Mago" +
                "poderes=" + poderes +
                '}' ;
    }
}
