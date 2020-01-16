package inheritance;

import java.util.LinkedList;

public class Shop extends Business implements Reviewable{


    public Shop(String name, String description, int price_range, double stars) {
        super(name, description, price_range, stars);
    }

}
