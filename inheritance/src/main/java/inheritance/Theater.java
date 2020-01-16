package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater extends Business implements Reviewable {
    private String name;
    private int price_range;
    private double stars;
    private LinkedList<Review> reviews;
    private ArrayList<String> movies;

    public Theater(String name, int price_range, double stars) {
        super(name, price_range, stars);
        this.reviews = new LinkedList<>();
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    public ArrayList<String> getMovies(){
        return this.movies;
    }

    public void removeMovie(String movieName) {
        this.movies.remove(movieName);
    }
}
