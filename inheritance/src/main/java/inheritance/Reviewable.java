package inheritance;

import java.util.LinkedList;

public interface Reviewable {

    void addReview(Review review);
    LinkedList getReviews();
    double calculateAvg(LinkedList reviews);

}
