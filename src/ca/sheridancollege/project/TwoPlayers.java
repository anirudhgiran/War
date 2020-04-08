/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anirudh Giran
 * @modifier Simranjeet Singh
 */
public class TwoPlayers extends Player {

    Scanner input = new Scanner(System.in);
    TwoHands hands = new TwoHands();
    CardDump dump = new CardDump();
    char choice = 'y';

    private ArrayList<Card> handOne = new ArrayList<>();
    private ArrayList<Card> handTwo = new ArrayList<>();

    public TwoPlayers(String name) {
        super(name);
        handOne = hands.getHandOne();
        handTwo = hands.getHandTwo();
    }

    public void play() {

        do {
            if (!handOne.isEmpty() && !handTwo.isEmpty()) {
                String playerOneLast = getHandOne().get(getHandOne().size() - 1).getValue() + " OF " + getHandOne().get(getHandOne().size() - 1).getSuit();
                System.out.println("Card drawn by Player 1: " + playerOneLast);
                dump.setDump(getHandOne().get(getHandOne().size() - 1));

                String playerTwoLast = getHandTwo().get(getHandTwo().size() - 1).getValue() + " OF " + getHandTwo().get(getHandTwo().size() - 1).getSuit();
                System.out.println("Card drawn by Player 2: " + playerTwoLast);
                dump.setDump(getHandTwo().get(getHandTwo().size() - 1));

                int playerOneCardValue = dump.getDump().get(0).getValue().ordinal();
                int playerTwoCardValue = dump.getDump().get(1).getValue().ordinal();

                if (playerOneCardValue > playerTwoCardValue) {
                    System.out.println("************Player One Gets The Dump*************");
                    for (Card c : dump.getDump()) {
                        getHandOne().add(0, c);
                    }
                    dump.getDump().clear();
                    
                    System.out.print("Enter 'y' or 'Y' to continue: ");
                    choice = input.next().charAt(0);
                    
                } else if (playerTwoCardValue > playerOneCardValue) {
                    System.out.println("************Player Two Gets The Dump*************");
                    for (Card c : dump.getDump()) {
                        getHandTwo().add(0, c);
                    }
                    dump.getDump().clear();
                    
                    System.out.print("Enter 'y' or 'Y' to continue: ");
                    choice = input.next().charAt(0);
                    
                } else if (playerTwoCardValue == playerOneCardValue) {
                    System.out.println("**************No one gets the dump, it's a tie************");
                    choice = 'y';
                }
            }else{
                break;
            }
        } while (choice == 'Y' || choice == 'y');
        
        if(getHandOne().isEmpty()||getHandTwo().isEmpty()){
            Winner win = new Winner();
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
