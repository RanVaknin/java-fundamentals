package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop;
    Review review1;
    Review review2;
    Review review3;
    Review review4;
    Review review5;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Wallgreens","great spot", 0, 2);
        review1 = new Review("Awesome", "2Pac", 1);
        review2 = new Review("Amazing", "Biggy", 2);
        review3 = new Review("Revolutionary", "Eminem", 3);
        review4 = new Review("Yay", "IceCube", 4);
        review5 = new Review("Badabadada", "Snoop Dogg", 5);

        shop.addReview(review1);
        shop.addReview(review2);
        shop.addReview(review3);
        shop.addReview(review4);
        shop.addReview(review5);
    }
    @Test
    public void testToString() {
        //checking that I can add reviews to a list.
        String expected ="Business: name='Wallgreens', description='great spot', price_range=0, stars=3.0}";
        String actual = shop.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addReview_test() {
        //checking the last added review.
        Review review6 = new Review("Great shopkeeper","Luke Bryan",4.5);
        shop.addReview(review6);
        String expected = "4.5 Stars.  Great shopkeeper\n" +
                " was written by: Luke Bryan.";
        String actual = shop.getReviews().get(5).toString();
        Assert.assertEquals(expected,actual);

    }
}