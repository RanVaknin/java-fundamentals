package inheritance;

import java.util.LinkedList;

public interface Reviewable {

    void addReview(Review review);
    LinkedList<Review> getReviews();
    double calculateAvg(LinkedList<Review> reviews);

}
