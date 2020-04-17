package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Anirudh Giran
 * @modifier Simranjeet Singh
 */
public class TwoPlayers extends Player {

    Scanner input = new Scanner(System.in);
    private TwoHands hands = new TwoHands();
    private CardDump dump = new CardDump();
    private char choice = 'y';
    private TwoPlayers play;
    private static TwoPlayers instance = null;

    private ArrayList<Card> handOne = new ArrayList<>();
    private ArrayList<Card> handTwo = new ArrayList<>();
    private int playerOneCardValue, playerTwoCardValue;

    public TwoPlayers() {

        handOne = hands.getHandOne();
        handTwo = hands.getHandTwo();
    }

    public static TwoPlayers getInstance() {
        {
            if (instance == null) {
                instance = new TwoPlayers();
            }
            return instance;
        }
    }

    public void setObject(TwoPlayers play) {
        this.play = play;
    }

    public void play() {

        do {
            if (!handOne.isEmpty() && !handTwo.isEmpty()) {
                String playerOneLast = handOne.get(handOne.size() - 1).getValue()
                        + " OF " + handOne.get(handOne.size() - 1).getSuit();

                System.out.println("\nCard drawn by Player 1: " + playerOneLast);
                dump.setDump(handOne.get(handOne.size() - 1));
                handOne.remove(handOne.size() - 1);

                String playerTwoLast = handTwo.get(handTwo.size() - 1).getValue()
                        + " OF " + handTwo.get(handTwo.size() - 1).getSuit();

                System.out.println("Card drawn by Player 2: " + playerTwoLast);
                dump.setDump(handTwo.get(handTwo.size() - 1));
                handTwo.remove(handTwo.size() - 1);

                int dumpLast = dump.getDump().size() - 1;
                int dumpSecondLast = dump.getDump().size() - 2;

                playerOneCardValue = dump.getDump().get(dumpSecondLast).getValue().ordinal();
                playerTwoCardValue = dump.getDump().get(dumpLast).getValue().ordinal();

                if (playerOneCardValue > playerTwoCardValue) {
                    System.out.println("\n************Player One Gets The Dump*************\n");

                    for (Card c : dump.getDump()) {
                        handOne.add(0, c);

                    }
                    dump.getDump().clear();

                    System.out.print("Enter 'y' or 'Y' to continue or anything else to end game: ");
                    choice = input.next().charAt(0);
                   
                } else if (playerTwoCardValue > playerOneCardValue) {
                    System.out.println("\n************Player Two Gets The Dump*************\n");

                    for (Card c : dump.getDump()) {
                        handTwo.add(0, c);

                    }
                    dump.getDump().clear();

                    System.out.print("Enter 'y' or 'Y' to continue or anything else to end game: ");
                    choice = input.next().charAt(0);
                    

                } else if (playerOneCardValue == playerTwoCardValue) {
                    System.out.println("\n**************No one gets the dump, it's a tie************\n");
                    choice = 'y';
                }
            } else {
                choice = 'n';
            }
        } while (choice == 'Y' || choice == 'y');

        if (handOne.isEmpty() || handTwo.isEmpty()) {
            Winner win = new Winner(play);
            win.setHandOne(handOne);
            win.setHandTwo(handTwo);
            win.declareWinner();
        } else if (!handOne.isEmpty() || !handTwo.isEmpty()) {
            Winner win = new Winner(play);
            win.setHandOne(handOne);
            win.setHandTwo(handTwo);
            win.declareWinner();
        }

    }

    /**
     * @return the handOne
     */
    public ArrayList<Card> getHandOne() {
        return handOne;
    }

    /**
     * @return the handTwo
     */
    public ArrayList<Card> getHandTwo() {
        return handTwo;
    }

}
