package inheritance;

import java.util.LinkedList;

public class Restaurant extends Business implements Reviewable {
    private String name;
    private int price_range;
    private double stars;
    private LinkedList<Review> reviews;

    public Restaurant(String name, int price_range, double stars) {
        super(name, price_range, stars);
    }
}