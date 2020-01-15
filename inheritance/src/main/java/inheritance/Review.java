package inheritance;

public class Review {
    private String body;
    private String author;
    private double stars;
    Reviewable reviewable;

    public Review( String body, String author, double stars, Reviewable reviewable) {
        if (stars > 5 || stars < 0){
            throw new RuntimeException("Ratings are between 0-5");
        } else {
            this.body = body;
            this.author = author;
            this.stars = stars;
            reviewable.addReview(this);
            this.reviewable = reviewable;

        }
    }
    public double getStars() {

        return stars;
    }
    public String toString(){
        return this.stars + " Stars.  " + this.body +"\n was written by: " + this.author +".";
    }
}
