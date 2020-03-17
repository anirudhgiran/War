/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author aniru
 */
public class TwoPlayers {
    
    TwoHands set = new TwoHands();
    
    ArrayList<Card> s = new ArrayList<>();
    ArrayList<Card> v = new ArrayList<>();
    
    public TwoPlayers(){
        s=set.getHandOne();
        v = set.getHandTwo();
        
    }
    
    
}
