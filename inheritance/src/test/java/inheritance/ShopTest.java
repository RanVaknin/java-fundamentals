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
        review1 = new Review("Awesome", "2Pac", 1,shop);
        review2 = new Review("Amazing", "Biggy", 2,shop);
        review3 = new Review("Revolutionary", "Eminem", 3,shop);
        review4 = new Review("Yay", "IceCube", 4,shop);
        review5 = new Review("Badabadada", "Snoop Dogg", 5,shop);

        shop.addReview(review1);
        shop.addReview(review2);
        shop.addReview(review3);
        shop.addReview(review4);
        shop.addReview(review5);
    }
    @Test
    public void testToString() {
        String expected ="Shop: name='Wallgreens', description='great spot', price_range=2, stars=3.0, reviews=[1.0 Stars.  Awesome\n" +
                " was written by: 2Pac., 2.0 Stars.  Amazing\n" +
                " was written by: Biggy., 3.0 Stars.  Revolutionary\n" +
                " was written by: Eminem., 4.0 Stars.  Yay\n" +
                " was written by: IceCube., 5.0 Stars.  Badabadada\n" +
                " was written by: Snoop Dogg.]}";
        String actual = shop.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addReview() {
    }

    @Test
    public void calculateAvg() {
    }

    @Test
    public void getReviews() {
    }


}