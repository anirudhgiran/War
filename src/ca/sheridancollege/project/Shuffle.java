package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aniru
 */
public class Shuffle {
    
    private ArrayList<Card> shuffledDeck = new ArrayList<>();
    
    public void setDeck(ArrayList<Card> c){
        
        this.shuffledDeck = c;
        
        
    }
    
    public ArrayList<Card> getShuffledDeck(){
        Collections.shuffle(shuffledDeck);
        return shuffledDeck;
    }
}
