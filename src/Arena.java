import model.Guerreiro;
import model.Mago;

import java.util.Random;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Random d20 = new Random();
        int numeroGerado = d20.nextInt(1,21);
        Scanner jogue = new Scanner(System.in);

        System.out.println("Crie seu personagem");
        String nome = jogue.nextLine();

        Guerreiro RatoGuerreiro = new Guerreiro(nome, 50, 90 );
        Mago remi = new Mago("remi", 25, 130);

        System.out.println(RatoGuerreiro);
    }


}

