/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anirudh Giran
 * @modifier Advit Verma
 */
public class Main {

    public static void main( String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("++++++++++War Card Game+++++++++");
        System.out.println("Please enter the player names");
        System.out.print("Player 1: ");
        String player1 = input.next();
        System.out.print("Player 2: ");
        String player2 = input.next();
        
        TwoPlayers play = new TwoPlayers();
        
        play.setPlayer1ID(player1);
        play.setPlayer2ID(player2);
        play.setObject(play);
        
        System.out.println("Enter 'P' or 'p' to start the game");
        char choice = input.next().charAt(0);
        
        if(choice == 'p' || choice == 'P'){
            play.play();
        }
    }
}
