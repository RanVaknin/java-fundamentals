package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater implements Reviewable {
    private String name;
    private double stars;
    private ArrayList<String> movies;
    private LinkedList<TheaterReview> reviews;

    public Theater(String name, double stars, ArrayList<String> movies) {
        this.name = name;
        this.stars = stars;
        this.movies = movies;
        this.reviews = new LinkedList<>();
    }


    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        this.movies.remove(movieName);
    }

    @Override
    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add((TheaterReview) review);
            this.stars = calculateAvg(this.reviews);
        } else {
            throw new RuntimeException("Your review already exists in our system");
        }
    }

    @Override
    public double calculateAvg(LinkedList reviews) {
        double avg = 0;
        for (Review review : this.reviews) {
            avg += review.getStars();
        }
        avg = avg / this.reviews.size();
        return avg;
    }

    @Override
    public LinkedList getReviews() {
        return this.reviews;
    }
}
