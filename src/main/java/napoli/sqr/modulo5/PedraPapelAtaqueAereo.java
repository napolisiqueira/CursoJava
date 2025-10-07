package napoli.sqr.modulo5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PedraPapelAtaqueAereo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N;
        String player1;
        String player2;

        while (true) {
            try {
                System.out.println("Digite o numero de testes: ");
                N = read.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Você não digitou um numero... Tente novamente.");
                read.nextLine();
                continue;
            }
        }
        for (int i = 1; i <= N; i++) {
            do {
                System.out.println("Digite a jogada do player 1: ");
                player1 = read.next();
                System.out.println("Digite a jogada do player 2: ");
                player2 = read.next();
            } while (!validation(player1, player2));

            Result(player1, player2);
            read.close();
        }

    }


    public static Boolean validation(String player1, String player2) {
        return (player1.equalsIgnoreCase("Ataque") || player1.equalsIgnoreCase("Pedra") || player1.equalsIgnoreCase("Papel")) &&
                (player2.equalsIgnoreCase("Ataque") || player2.equalsIgnoreCase("Pedra") || player2.equalsIgnoreCase("Papel"));
    }


    public static void Result(String player1, String player2){
        if (player1.equalsIgnoreCase("Ataque") && player2.equalsIgnoreCase("Ataque")) System.out.println("Aniquilação mutua.");
        else if (player1.equalsIgnoreCase("Papel") && player2.equalsIgnoreCase("Papel")) System.out.println("Ambos jogadores venceram.");
        else if (player1.equalsIgnoreCase("Pedra") && player2.equalsIgnoreCase("Pedra")) System.out.println("Empate.");
        else if (player1.equalsIgnoreCase("Ataque")) System.out.println("O jogador 1 venceu.");
        else if (player2.equalsIgnoreCase("Ataque")) System.out.println("O jogador 2 venceu.");
        else if (player1.equalsIgnoreCase("Pedra")) System.out.println("O jogador 1 venceu.");
        else if (player2.equalsIgnoreCase("Pedra")) System.out.println("O jogador 2 venceu.");
    }
}
