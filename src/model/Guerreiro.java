package model;

public class Guerreiro extends Personagem{

    private int forcaFisica;


    public Guerreiro(String nome, int vidaMaxima, int forcaFisica) {
        super(nome, vidaMaxima);
        this.forcaFisica = forcaFisica;

    }

    @Override
    public int atacar() {
        System.out.printf("O guerreiro" + getNome() + "atacar com seu aviao");
        return this.forcaFisica;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "forcaFisica=" + forcaFisica +
                super.toString();
    }
}
