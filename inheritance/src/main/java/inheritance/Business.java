package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Business implements Reviewable {
    private String name;
    private String description;
    private int price_range;
    private double stars;
    private LinkedList<Review> reviews;
    private ArrayList<String> movies;

    public Business(String name, String description, int price_range, double stars) {
        this.name = name;
        this.description = description;
        this.price_range = price_range;
        this.stars = stars;
        this.movies = new ArrayList<>();
        this.reviews = new LinkedList<>();

    }
    public Business(String name, int price_range, double stars, String movieName){
        this(name,"",price_range,stars);

    }

    public Business(String name, int price_range,double stars){
        this(name,price_range,stars,"");
    }


    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice_range() {
        return this.price_range;
    }

    public double getStars() {
        return this.stars;
    }

    @Override
    public LinkedList<Review> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            this.stars = calculateAvg(this.reviews);
        } else {
            throw new RuntimeException("Your review already exists in our system");
        }
    }

    @Override
    public double calculateAvg(LinkedList<Review> reviews) {
        double avg = 0;
        for (Review review : this.reviews) {
            avg += review.getStars();
        }
        avg = avg / this.reviews.size();
        return avg;
    }


    @Override
    public String toString() {
        return "Business: " +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price_range=" + price_range +
                ", stars=" + stars +
                '}';
    }
}
