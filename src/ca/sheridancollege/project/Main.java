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
        
     
        int sub=0;
        while (sub<one.getDump().size()){
        
            System.out.println("Test"+one.getDump().get(sub));
        
        
        }
        
        
        int sub1=0;
        
        while(sub1<one.getDump().size()){
         System.out.println("Test"+two.showCards().get(sub));
         sub1++;
         
        
        }
        
        
        
        
           
        
        
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        

       
    }


