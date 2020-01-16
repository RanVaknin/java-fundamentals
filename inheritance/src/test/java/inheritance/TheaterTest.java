package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TheaterTest {
    Theater theater;
    Review review1;
    Review review2;
    Review review3;
    Review review4;

    @Before
    public void setUp() throws Exception {
        review1 = new Review("Love the reclining seats","Martin Scorcese",4.8,"King Kong");
        review2 = new Review("Stale popcorn","Leo Dicaprio",3.2,"Jumanji");
        review3 = new Review("Great looking workers","Jeffrey Epstein",5,"Tropic Thunder");
        review4 = new Review("Sound system is poor","Hans Zimmer",2,"School of Rock");

        theater = new Theater("AMC Lowes",2,0);

        theater.addMovie("King Kong");
        theater.addMovie("School of Rock");
        theater.addMovie("Jumanji");
        theater.addMovie("Tropic thunder");

        theater.addReview(review1);
        theater.addReview(review2);
        theater.addReview(review3);
        theater.addReview(review4);
    }
    @Test
    public void testToString() {
        //checking that I can add reviews to a list.
        String expected ="Business: name='AMC Lowes', description='', price_range=2, stars=3.75}";
        String actual = theater.toString();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addMovie_test() {
        // check to see if the last element in the array is actually "Love Actually"
        theater.getMovies().add("Love Actually");
        String expected = "Love Actually";
        String actual = theater.getMovies().get(4);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeMovie_test() {
        // see if removes the movie from the list.
        theater.getMovies().remove("Jumanji");
        int expected = 3;
        int actual = theater.getMovies().size();
        Assert.assertEquals(expected,actual);
    }
}