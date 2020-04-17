package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Anirudh Giran
 * @modifier Advit Verma
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean p1 = false;
        boolean p2 = false;
        String player1, player2;

        TwoPlayers play = TwoPlayers.getInstance();
        System.out.println("++++++++++War Card Game+++++++++");
        System.out.println("Please enter the player names(Min. 1 character and Max. 12 characters)");

        while (p1 == false) {
            System.out.print("Player 1: ");
            player1 = input.next();
            p1 = play.setPlayer1ID(player1);
        }
        while (p2 == false) {
            System.out.print("Player 2: ");
            player2 = input.next();
            p2 = play.setPlayer2ID(player2);
        }

        play.setObject(play);

        System.out.println("\n\t******** GAME RULES ***********\n");
        System.out.print("\t1. Players can draw only one card at a time\n");
        System.out.print("\t2. If both the players draw cards with same value,\n\t   the next round begins automatically\n");
        System.out.print("\t3. The player who has no cards left in hand loses the game\n");
        System.out.print("\t4. If at any time, players want to end the game,\n\t   then the player having more cards in hand wins the game\n");

        System.out.println("\nEnter 'P' or 'p' to start the game");
        char choice = input.next().charAt(0);

        if (choice == 'p' || choice == 'P') {
            play.play();
        } else {
            System.out.println("Invalid Choice, thank you");
        }
    }
}
