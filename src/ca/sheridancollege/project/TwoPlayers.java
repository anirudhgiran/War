/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Anirudh Giran
 * @modifier Simranjeet Singh
 */
public class TwoPlayers extends Game{
    
    TwoHands set = new TwoHands();
    
    ArrayList<Card> s = new ArrayList<>();
    ArrayList<Card> v = new ArrayList<>();
    
    public TwoPlayers(){
        super("");
        s=set.getHandOne();
        v = set.getHandTwo();
        
    }
    
    public void play(){};
    public void declareWinner(){};
    
    
}
