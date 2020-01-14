package inheritance;

import java.util.LinkedList;

public class Restaurant {
    String name;
    double stars;
    String price_range;
    LinkedList<Review> reviews;

    public Restaurant(String name, int stars, String price_range) {
        this.name = name;
        this.stars = stars;
        this.price_range = price_range;
        this.reviews = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Restaurant: " +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price_range='" + price_range + "\n" +
                ", reviews=" + reviews.toString();
    }

    public double calculateAvg(LinkedList<Review> reviews){
        double avg = 0;
        for(Review review : this.reviews){
            avg += review.stars;
        }
        avg = avg/ this.reviews.size();
        return avg;
    }

    //makes sure there is no duplicate review and updates the average score of the restaurant.
    public void addReview(Review review){
        if (!this.reviews.contains(review)){
            this.reviews.add(review);
            this.stars = calculateAvg(this.reviews);
        } else {
            throw new RuntimeException("Your review already exists in our system");
        }
    }
}


