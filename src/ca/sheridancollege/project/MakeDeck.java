package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.SUITS;
import ca.sheridancollege.project.Card.VALUES;
import java.util.ArrayList;

/**
 *
 * @author aniru
 */
public class MakeDeck {
    
    private ArrayList<Card> deck = new ArrayList<>();
    
    public MakeDeck(){
        
        for(SUITS s : SUITS.values())
            for( VALUES v : VALUES.values()){
                Deck c = new Deck(s,v);
                deck.add(c);
            }
    }
    
    public ArrayList<Card> getDeck(){
        return this.deck;
    }
    
    
}
