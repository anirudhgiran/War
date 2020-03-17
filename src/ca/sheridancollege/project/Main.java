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
        
        //System.out.println(one.getDump());
        
        for(int sub=0;sub<=one.getDump().size()-1;sub++){
        
            System.out.println("Test"+one.getDump().get(sub));
        
        
        }
        
         for(int sub=0;sub<=two.showCards().size()-1;sub++){
        
            System.out.println("Test"+two.showCards().get(sub));
        
        
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        

       
    }

}
