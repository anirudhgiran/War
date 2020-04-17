/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aniru
 */
public class PlayerTest {

    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setPlayer1ID method, of class Player.
     */
    @Test
    public void testSetPlayer1IDGood() {
        System.out.println("setPlayer1ID Good");
        String givenID = "asfds";
        Player instance = new PlayerImpl();
        boolean expResult = true;
        boolean result = instance.setPlayer1ID(givenID);
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayer1ID method, of class Player.
     */
    @Test
    public void testSetPlayer1IDbad() {
        System.out.println("setPlayer1ID bad");
        String givenID = "";
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.setPlayer1ID(givenID);
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayer1ID method, of class Player.
     */
    @Test
    public void testSetPlayer1IDboundary() {
        System.out.println("setPlayer1ID boundary");
        String givenID = "ssddffgghhaa";
        Player instance = new PlayerImpl();
        boolean expResult = true;
        boolean result = instance.setPlayer1ID(givenID);
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayer2ID method, of class Player.
     */
    @Test
    public void testSetPlayer2IDGood() {
        System.out.println("setPlayer2ID good");
        String givenID = "afdd";
        Player instance = new PlayerImpl();
        boolean expResult = true;
        boolean result = instance.setPlayer2ID(givenID);
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayer2ID method, of class Player.
     */
    @Test
    public void testSetPlayer2IDbad() {
        System.out.println("setPlayer2ID");
        String givenID = "";
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.setPlayer2ID(givenID);
        assertEquals(expResult, result);

    }

    /**
     * Test of setPlayer2ID method, of class Player.
     */
    @Test
    public void testSetPlayer2IDboundary() {
        System.out.println("setPlayer2ID boundary");
        String givenID = "ddff44556644";
        Player instance = new PlayerImpl();
        boolean expResult = true;
        boolean result = instance.setPlayer2ID(givenID);
        assertEquals(expResult, result);

    }

    public class PlayerImpl extends Player {

        public void play() {
        }
    }

}
