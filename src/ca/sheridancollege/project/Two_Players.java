/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aniru
 */
public class Two_Players extends Player{
    
    public Two_Players(String name){
        super(name);
    }
    
    
    
    public void play(){
        Deck cards = new Deck();
        ArrayList<String>deck = new ArrayList<>();
        
        for(int i=0;i<52;i++){
            deck.add(cards.toString());
        }
        
        Collections.shuffle(deck);
        
        ArrayList<String> hand1 = new ArrayList<>();
        
        for(int i=0;i<26;i++){
            hand1.add(deck.get(i));
        }
        
        ArrayList<String> hand2 = new ArrayList<>();
        
        for(int i=26;i<52;i++){
            hand2.add(deck.get(i));
        }
        
    }
    
}
