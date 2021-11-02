package test;

import Online.SalesItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class java {
    @Test
    public void averageCommentRating() {

        SalesItem itemThree = new SalesItem("Studsboll", 30, 100);

        assertEquals(true, itemThree.addComment("Monika", "Helt fantastiskt, jag älskar dig mer än världen.", 1));
        assertEquals(true, itemThree.addComment("fred", "blka.", 3));
        assertEquals(true, itemThree.addComment("våld", "Htuturu.", 4));
        assertEquals(true, itemThree.addComment("hat", "grrrrr", 5));

        assertEquals(5, itemThree.ratingAverage());

    }
}