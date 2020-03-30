/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.SUITS;
import java.util.ArrayList;

/**
 *
 * @author Anirudh Giran
 * @modifier Simranjeet Singh
 */
public class TwoPlayers extends Game{
    
    TwoHands set = new TwoHands();
    
    ArrayList<Card> player1Cards = new ArrayList<>();
    ArrayList<Card> player2Cards = new ArrayList<>();
    CardDump dump = new CardDump();
    public TwoPlayers(){
        super("");
         player1Cards = set.getHandOne();
        player2Cards = set.getHandTwo();
        
    }
    
    public void play(){
       do {
            for (int i = 1; i < player1Cards.size(); i++) {
                Card player1Card = player1Cards.get(i);
                Card player2Card = player2Cards.get(i);
                System.out.println(player1Card.getValue() + " of " + player1Card.getSuit());
                System.out.println(player2Card.getSuit() + "of" + player2Card.getValue());
                if (player1Cards.size() < player2Cards.size()) {
                    player2Cards.add((player1Card));
                } else if (player1Cards.size() > player2Cards.size()) {
                    player1Cards.add(player2Card);
                } else {
                    dump.setDump(player1Card);
                    dump.setDump(player2Card);
                }
            }
        } while (player1Cards == null || player2Cards == null);
    }
    public void declareWinner(){};
    
    
}
