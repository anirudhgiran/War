/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.SUITS;
import java.util.ArrayList;

/**
 *
 * @author Anirudh Giran
 * @modifier Simranjeet Singh
 */
public class TwoPlayers extends Game{
    
    TwoHands set = new TwoHands();
    
    ArrayList<Card> s = new ArrayList<>();
    private ArrayList<Card> v = new ArrayList<>();
    private ArrayList <CardDump> dp=new ArrayList<>();
    public TwoPlayers(){
        super("");
        s=set.getHandOne();
        v = set.getHandTwo();
        
    }
    
    public void play(){
        while(s==null){
            s.remove(s.size()-1);
        }
        if(s.equals(v)){
           
        }
        
        if(s.isEmpty()){
            
        }
        
        if(v.isEmpty()){
        }
    };
    public void declareWinner(){};

    /**
     * @return the v
     */
    public ArrayList<Card> getV() {
        return v;
    }

    /**
     * @return the dp
     */
    public ArrayList <CardDump> getDp() {
        return dp;
    }

    /**
     * @param dp the dp to set
     */
    public void setDp(ArrayList <CardDump> dp) {
        this.dp = dp;
    }
    
    
}
