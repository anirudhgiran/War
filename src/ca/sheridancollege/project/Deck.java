/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author aniru
 */
public class Deck extends Card{
    
    private String newCard = new String();
    
    private enum SUIT{HEARTS,CLUB,SPADE,DIAMOND};
    public SUIT suit;
    
    private enum VALUES{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JOKER,QUEEN,KING};
    public VALUES values;
    
    public String toString(){
        
        for(SUIT s: SUIT.values())
            for(VALUES v: VALUES.values())
                newCard += v + " OF " + s;
        return newCard;
    }
    
    
    
}
