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
public class CardDump {
    
    private ArrayList<Card> dump = new ArrayList<>();

    /**
     * @return the dump
     */
    public ArrayList<Card> getDump() {
        return this.dump;
    }

    /**
     * @param dump the dump to set
     */
    public void setDump(Card dump) {
        this.dump.add(dump);
    }
    
    
}
