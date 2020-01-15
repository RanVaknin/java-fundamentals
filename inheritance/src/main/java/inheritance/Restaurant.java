package inheritance;

import java.util.LinkedList;

public class Restaurant implements Reviewable {
    private String name;
    private double stars;
    private int price_range;
    private LinkedList<Review> reviews;

    public Restaurant(String name, double stars, int price_range) {
        this.name = name;
        this.stars = stars;
        this.price_range = price_range;
        this.reviews = new LinkedList<>();
    }

    public double getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Restaurant: " +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price_range='" + price_range + "\n" +
                ", reviews=" + reviews.toString();
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
    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    //makes sure there is no duplicate review and updates the average score of the restaurant.
    @Override
    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            this.stars = calculateAvg(this.reviews);
        } else {
            throw new RuntimeException("Your review already exists in our system");
        }
    }
}