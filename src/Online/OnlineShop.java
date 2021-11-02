/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online;

import test.SalesItemTest;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Maritha Dahlin
 */
public class OnlineShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   SalesItemTest start = new SalesItemTest();
   start.testAddComment();
   Comment rating = new Comment();

   rating.getRating();
   SalesItem after = new SalesItem("Badboll", 500, 30);

   after.addComment("Monika", "Helt fantastiskt, jag älskar dig mer än världen.", 5);
   after.addComment("fred", "blka.",4);
   after.addComment("våld", "Htuturu.", 3);
   after.addComment("hat", "grrrrr", 2);



   after.getPrice();
   after.upvoteComment(2);
   after.downvoteComment(1);
   after.showInfo();
   after.ratingAverage();


   SalesItem itemOne = new SalesItem("Badboll", 1200, 50);
   itemOne.getPrice();

   itemOne.showInfo();

   SalesItem itemTwo = new SalesItem("Rugbyboll", 5000, 30);
   itemTwo.getPrice();

   itemTwo.showInfo();

   SalesItem itemThree = new SalesItem("Fotboll", 7500, 25);
       itemThree.getPrice();

       itemThree.showInfo();
   SalesItem itemFour = new SalesItem("Sovboll", 300, 75);
       itemFour.getPrice();

       itemFour.showInfo();


    }
    
}
