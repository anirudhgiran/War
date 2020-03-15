/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author Sivagama
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList<>();
    

    public GroupOfCards() {
        MakeDeck c = new MakeDeck();
        Shuffle s = new Shuffle();
        s.setDeck(c.getDeck());
        this.cards = s.getShuffledDeck();
       
    }

    public ArrayList<Card> showCards() {
        return this.cards;
    }

}
