/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Anirudh Giran
 * @modifier Jasleen Kaur
 */
public class Winner extends Game {

    private String winner = new String();

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Winner() {
        super("War Card Game");
    }

    public void declareWinner() {
        TwoPlayers obj = new TwoPlayers("");
        
        if(obj.getHandOne().isEmpty()){
            
        }else if(obj.getHandTwo().isEmpty()){
            
        }
    }

}
