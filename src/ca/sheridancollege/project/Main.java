/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Anirudh Giran
 * @modifier Advit Verma
 */
public class Main {

    public static void main( String[] args) {
        
        
        CardDump one = new CardDump();
        GroupOfCards two=new GroupOfCards();
        MakeDeck y= new MakeDeck();
        TwoHands h=new TwoHands();
        
        //System.out.println(one.getDump());
        
      
        
         for(int sub=0;sub<h.getHandOne().size();sub++){
        
           System.out.println(h.getHandOne());
        
        
        }
         
         
         
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        

       
    }

}
