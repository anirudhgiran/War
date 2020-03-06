/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author aniru
 */
public class Main {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        int choice;
        
        System.out.println("***********WELCOME TO WAR GAME***********");
        
        System.out.println("\nChoose number of players:");
        
        System.out.println("1. Two Players");
        
        System.out.println("2. Four Players");
        
        System.out.print("\n:");
        
        choice = input.nextInt();
        
        if(choice == 1){
            System.out.println("\t**********NO SPACE SHOULD BE USED IN NAME**********\n");
            
            System.out.print("Enter the name of Player 1: ");
            String name1 = input.next();
            
            System.out.print("Enter the name of Player 2: ");
            String name2 = input.next();
            
            Two_Players player1 = new Two_Players(name1);
            Two_Players player2 = new Two_Players(name2);
            
            System.out.println("Welcome " + name1 + " & " + name2);
            
            
            
        }else if(choice == 2){
            System.out.println("\t**********NO SPACE SHOULD BE USED IN NAME**********\n");
            
            System.out.print("Enter the name of Player 1: ");
            String name1 = input.next();
            
            System.out.print("Enter the name of Player 2: ");
            String name2 = input.next();
            
            System.out.print("Enter the name of Player 3: ");
            String name3 = input.next();
            
            System.out.print("Enter the name of Player 4: ");
            String name4 = input.next();
            
            Four_Players player1 = new Four_Players(name1);
            Four_Players player2 = new Four_Players(name2);
            Four_Players player3 = new Four_Players(name3);
            Four_Players player4 = new Four_Players(name4);
            
            System.out.println("Welcome " + name1 + ", " + name2 + ", " + name3 +" & " + name4);
        }
        
        
        
    }
}
