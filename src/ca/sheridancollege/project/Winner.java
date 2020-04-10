package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @author Anirudh Giran
 * @modifier Jasleen Kaur
 */
public class Winner extends Game {

    private String winner = new String();
    private ArrayList<Card> handOne;
    private ArrayList<Card> handTwo;
    private TwoPlayers play;
    
    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Winner(TwoPlayers play) {
        super("War Card Game");
        this.play = play;
    }

    @Override
    public void declareWinner() {
        
        if(play.getHandOne().isEmpty()){
            System.out.println("\n**************** " + play.getPlayer2ID() +" won the game ******************\n");
        }else if(play.getHandTwo().isEmpty()){
            System.out.println("\n**************** " + play.getPlayer1ID() +" won the game ******************\n");
        }else if(!play.getHandOne().isEmpty() || !play.getHandTwo().isEmpty()){
            int handOneSize = handOne.size();
            int handTwoSize = handTwo.size();
            
            if(handOneSize > handTwoSize){
                System.out.println("\n\t+++++++++ "+ play.getPlayer1ID() +" won the game ++++++++++++++");
            }else if( handTwoSize > handOneSize){
                System.out.println("\n\t+++++++++ "+ play.getPlayer2ID() +" won the game ++++++++++++++");
            }else{
                System.out.println("\n\t+++++++++ IT'S A DRAW ++++++++++++++");
            }
        }
    }

    /**
     * @param handOne the handOne to set
     */
    public void setHandOne(ArrayList<Card> handOne) {
        this.handOne = handOne;
    }

    /**
     * @param handTwo the handTwo to set
     */
    public void setHandTwo(ArrayList<Card> handTwo) {
        this.handTwo = handTwo;
    }

}
