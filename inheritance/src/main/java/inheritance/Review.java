package inheritance;

public class Review {
    String body;
    String author;
    double stars;

    public Review( String body, String author, double stars) {
        if (this.stars > 5 || this.stars < 0){
            throw new RuntimeException("Ratings are between 0-5");
        }
        this.body = body;
        this.author = author;
        this.stars = stars;

    }

    public String toString(){
        return this.stars + " Stars.  " + this.body +"\n was written by: " + this.author +".";
    }
}
