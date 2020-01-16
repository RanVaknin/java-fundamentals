package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant input;
    Review setup1;
    Review setup2;
    Review setup3;
    Review setup4;
    Review setup5;

    @Before
    public void setUp() throws Exception {
         input = new Restaurant("roccos", 2, 5);
        setup1 = new Review("This place is pretty good. My pizza is better", "Ethan Stowell", 4);
        setup2 = new Review("This pizza is the BEEZ KNEEZ!", "Guy Fieri", 4.5);
        setup3 = new Review("Needs a bit of creme freich but otherwise absolutely nailed it.", "Gordon Ramsay", 5);
        setup4 = new Review("Utterly Scrumptious", "Mary Berry", 4.2);
        setup5 = new Review("Better than the prison pizza for sure.", "Martha Stewart", 4.4);

        input.addReview(setup1);
        input.addReview(setup2);
        input.addReview(setup3);
        input.addReview(setup4);
        input.addReview(setup5);

    }

    @Test
    public void toString_test() throws Exception{
        String expected = "Business: name='roccos', description='', price_range=2, stars=4.42}";
        String actual = input.toString();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void reviewUpdate_test(){
        double expected = 4.42;
        double actual = input.getStars();
        Assert.assertEquals(expected,actual,0.0001);
    }
}