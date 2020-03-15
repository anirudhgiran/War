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
public class TwoHands extends GroupOfCards{
    
    private ArrayList<Card> deck = new ArrayList<>();
    
    public TwoHands(int size){
        super(size);
        this.deck = super.showCards();
    }
    
    public ArrayList<Card> g (){
        return this.deck;
    }
    
}
