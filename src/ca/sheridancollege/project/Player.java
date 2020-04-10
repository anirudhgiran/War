/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Sivagama
 */
public abstract class Player 
{
    private String player1ID; //the unique ID for this player
    private String player2ID;
    
    
    /**
     * @return the playerID
     */
    public String getPlayer1ID() 
    {
        return player1ID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayer1ID(String givenID) 
    {
        player1ID = givenID;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();

    /**
     * @return the player2ID
     */
    public String getPlayer2ID() {
        return player2ID;
    }

    /**
     * @param player2ID the player2ID to set
     */
    public void setPlayer2ID(String player2ID) {
        this.player2ID = player2ID;
    }
    
}
