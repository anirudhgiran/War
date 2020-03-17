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
public class TwoHands extends GroupOfCards {

    private ArrayList<Card> deck = new ArrayList<>();

    private ArrayList<Card> handOne = new ArrayList<>();
    private ArrayList<Card> handTwo = new ArrayList<>();

    public TwoHands() {
        GroupOfCards set= new GroupOfCards();
        this.deck = set.showCards();

        for (int i = 0; i < 26; i++) {
            handOne.add(deck.get(i));
        }

        for (int i = 26; i < 52; i++) {
            handTwo.add(deck.get(i));
        }
    }

    public ArrayList<Card> getHandOne() {
        return this.handOne;
    }

    public ArrayList<Card> getHandTwo() {
        return this.handTwo;
    }
}
