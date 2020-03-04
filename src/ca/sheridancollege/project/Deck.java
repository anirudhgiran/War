/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author aniru
 */
public class Deck extends Card{
    
    public enum Suits = {HEARTS,SPADE,CLUB,DIAMOND};
    
    
    public enum Values = {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JOKER,QUEEN,KING};
    
    public Deck(){
        super(Suits,Values);
    }
}
