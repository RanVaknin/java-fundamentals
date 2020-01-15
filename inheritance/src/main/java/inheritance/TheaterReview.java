package inheritance;

import java.util.LinkedList;

public class TheaterReview extends Review{
    String movie;
    LinkedList reviews;

    public TheaterReview(String body, String author, double stars, Reviewable reviewable, String movie) {
        super(body, author, stars, reviewable);
        this.movie = movie;
        this.reviews = new LinkedList();
    }

    @Override
    public String toString() {
        return "TheaterReview: " +
                "movie='" + movie + '\'' +
                ", reviews=" + reviews +
                ", reviewable=" + reviewable +
                '}';
    }
}

