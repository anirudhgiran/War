/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 */
public abstract class Card 
{
    public enum SUITS{HEARTS,CLUB,SPADE,DIAMOND};
    private SUITS suit;
    
    public enum VALUES{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
    EIGHT,NINE,TEN,JACK,QUEEN,KING};
    private VALUES value;
    
    public Card(SUITS s , VALUES v){
        this.suit = s;
        this.value = v;
    }
    
    public SUITS getSuit(){
        return this.suit;
    }
    
    public VALUES getValue(){
        return this.value;
    }
    
    
}
