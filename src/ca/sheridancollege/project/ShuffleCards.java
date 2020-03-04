/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Collections;

/**
 *
 * @author aniru
 */
public class ShuffleCards {
    
    
    private ArrayList<Card> cards = get.showcards();
    
 
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
}
