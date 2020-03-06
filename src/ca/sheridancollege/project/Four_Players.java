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
 * @author Anirudh
 */
public class Four_Players extends Player {
    
    public Four_Players(String name){
        super(name);
    }
    
    public void play(){
        
        Deck cards = new Deck();
        
        ArrayList<String>deck = new ArrayList<>();
        
        for(int i=0; i<52; i++){
            deck.add(cards.toString());
        }
        
        Collections.shuffle(deck);
        
        ArrayList<String>hand1 = new ArrayList<>();
        ArrayList<String>hand2 = new ArrayList<>();
        ArrayList<String>hand3 = new ArrayList<>();
        ArrayList<String>hand4 = new ArrayList<>();
        
        for(int i=0; i<13;i++){
            hand1.add(deck.get(i));
        }
        
        for(int i=13; i<26;i++){
            hand2.add(deck.get(i));
        }
        
        for(int i=26; i<39;i++){
            hand3.add(deck.get(i));
        }
        
        for(int i=39; i<52;i++){
            hand4.add(deck.get(i));
        }
        
        
        
    }
    
}
