package inheritance;

public class Review {
    private String body;
    private String author;
    private double stars;
    private String businessName;
    Reviewable reviewable;

    public Review(String body, String author, double stars, String businessName) {
        if (stars > 5 || stars < 0) {
            throw new RuntimeException("Ratings are between 0-5");
        } else {
            this.body = body;
            this.author = author;
            this.stars = stars;
            this.businessName = businessName;
        }
    }
    public Review(String body, String author, double stars) {
        this(body, author, stars, "");
    }

    public double getStars() {

        return stars;
    }

    public String toString() {
        return this.stars + " Stars.  " + this.body + "\n was written by: " + this.author + ".";
    }
}
