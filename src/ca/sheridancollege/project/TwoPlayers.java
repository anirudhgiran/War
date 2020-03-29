/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import ca.sheridancollege.project.GroupOfCards;
import ca.sheridancollege.project.Card.SUITS;
import ca.sheridancollege.project.Card;
import java.util.ArrayList;
import java.util.Collections;

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
        
        player1Cards=set.getHandOne();
        player2Cards = set.getHandTwo();
    }
        
    
    
    public void play(){
        
            for(int i = 1; i < player1Cards.size(); i++ ){
                Card player1Card = player1Cards.get(i);
                Card player2Card = player2Cards.get(i);
                System.out.println(player1Card.getValue()+" of "+player1Card.getSuit());
                System.out.println(player2Card.getSuit()+"of"+player2Card.getValue());
                dump.setDump(player1Cards);
                dump.setDump(player2Cards);
                
            }  
        
       } 
    public void declareWinner(){};
    
    
}