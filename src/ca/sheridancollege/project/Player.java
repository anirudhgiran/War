/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author Sivagama
 */
public abstract class Player {

    private String player1ID;
    private String player2ID;

    /**
     * @return the playerID
     */
    public String getPlayer1ID() {
        return player1ID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     * @return
     */
    public boolean setPlayer1ID(String givenID) {
        if (givenID.length() < 1 || givenID.length() > 12) {
            System.out.println("Invalid Player 1 ID");
        } else {
            this.player1ID = givenID;
            return true;
        }

        return false;
    }

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();

    /**
     * @return the player2ID
     */
    public String getPlayer2ID() {
        return player2ID;
    }

    public boolean setPlayer2ID(String givenID) {
        if (givenID.length() < 1 || givenID.length() > 12) {
            System.out.println("Invalid Player 2 ID");
        } else {
            this.player2ID = givenID;
            return true;
        }
        return false;
    }

}
