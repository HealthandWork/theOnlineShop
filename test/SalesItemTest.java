package test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Online.Comment;
import Online.SalesItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 *
 * @author marda237
 */
public class SalesItemTest {

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {

        SalesItem itemOne = new SalesItem("Merio Kart", 500);
        SalesItem itemTwo = new SalesItem("Robin Hood", 1000);
        assertEquals(false, itemOne.addComment("Johannes", "hej, någonting.", -20));


        assertEquals(itemOne.getNumberOfComments(),0);

    }
    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem itemOne = new SalesItem("Merio Kart", 500);
        assertEquals(false, itemOne.addComment("Peder", "Jag är ledsen och arg", 22));
        assertEquals(0, itemOne.getNumberOfComments());

    }
    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem itemTwo = new SalesItem("Robin Hood", 1000);
        assertEquals(false, itemTwo.addComment("Hannibal Barca", "Fattar inte riktigt.", -15));

    }
    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {

        SalesItem itemOne = new SalesItem("Badboll", 100);
        assertNotEquals("Testa namnet", itemOne.getName());
    }

    @Test
    public void addComment() {

        SalesItem itemThree = new SalesItem("Studsboll", 30);
        assertEquals(true, itemThree.addComment("Monika", "Helt fantastiskt, jag älskar dig mer än världen.", 5));
    }
    @Test
    public void totalValueStorage(){

    SalesItem sale1 = new SalesItem("Badboll", 10, 100);
    assertEquals(10, sale1.totalValueStorage());
    assertNotEquals(10000, sale1.totalValueStorage());

    }

    @Test
    public void totalItemValue() {

        SalesItem item1 = new SalesItem("BadBoll", 10, 100);
        SalesItem item2 = new SalesItem("Annat", 5, 20);
        SalesItem item3 = new SalesItem("Fotboll", 50, 1);

        int totalItemsValue = item1.totalValueStorage()+item2.totalValueStorage()+item3.totalValueStorage();
        assertEquals(11, totalItemsValue);
    }
    @Test
    public void positiveValueCheck() {
        SalesItem itemThree = new SalesItem("Studsboll", 30, 100);
        assertEquals(30, itemThree.totalValueStorage());
    }
    @Test
    public void negativeValueCheck() {

        SalesItem itemThree = new SalesItem("Studsboll", 30, 100);
        assertNotEquals(300, itemThree.totalValueStorage());
    }

}


