package inheritance;

import java.util.LinkedList;

public class Shop implements  Reviewable{
    String name;
    String description;
    int price_range;
    double stars;
    LinkedList<Review> reviews;

    public Shop(String name, String description, int stars, int price_range) {
        this.name = name;
        this.description = description;
        this.stars = stars;
        this.price_range = price_range;
        this.reviews = new LinkedList<>();
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
    public double calculateAvg(LinkedList reviews) {
        double avg = 0;
        for (Review review : this.reviews) {
            avg += review.getStars();
        }
        avg = avg / this.reviews.size();
        return avg;
    }

    public LinkedList<Review> getReviews(){
        return this.reviews;
    }

    @Override
    public String toString() {
        return "Shop: " +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price_range=" + price_range +
                ", stars=" + stars +
                ", reviews=" + reviews.toString() +
                '}';
    }
}
