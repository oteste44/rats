package model;

public abstract class Personagem {
    private String nome;
    private int vidaMaxima;

    public Personagem(String nome, int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;

        this.nome = nome;
    }

    public int getVida() {
        return this.vidaMaxima;
    }

    public String getNome() {
        return this.nome;
    }

    public void receberDano(int dano) {
        this.vidaMaxima -= dano;
        if (this.vidaMaxima <= dano) {
            System.out.println("morreu!");
        } else {
            this.vidaMaxima -= dano;
            System.out.printf(getNome() + "recebeu %d\n, voce tem %d", dano, this.vidaMaxima);
        }
    }

    public abstract int atacar();













}
