package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TheaterTest {
    Theater theater;
    TheaterReview review1;
    TheaterReview review2;
    TheaterReview review3;
    TheaterReview review4;

    @Before
    public void setUp() throws Exception {
        review1 = new TheaterReview("Love the reclining seats","Martin Scorcese",4.8,theater,"King Kong");
        review2 = new TheaterReview("Stale popcorn","Leo Dicaprio",3.2,theater,"Jumanji");
        review3 = new TheaterReview("Great looking workers","Jeffrey Epstein",5,theater,"Tropic Thunder");
        review4 = new TheaterReview("Sound system is poor","Hans Zimmer",2,theater,"School of Rock");


        ArrayList<String> movies = new ArrayList<>();
        movies.add("King Kong");
        movies.add("School of Rock");
        movies.add("Jumanji");
        movies.add("Tropic thunder");
        theater = new Theater("AMC Lowes",0,movies);
        theater.addReview(review1);
        theater.addReview(review2);
        theater.addReview(review3);
        theater.addReview(review4);
    }
    @Test
    public void toString_test(){
        String expected = "";
        String actual = theater.toString();
    }

    @Test
    public void addMovie_test() {
    }

    @Test
    public void removeMovie_test() {
    }

    @Test
    public void addReview_test() {
    }

    @Test
    public void calculateAvg_test() {
    }

    @Test
    public void getReviews_test() {
    }
}