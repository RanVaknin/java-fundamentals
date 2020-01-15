package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
         input = new Restaurant("roccos", 0, 2);
        setup1 = new Review("This place is pretty good. My pizza is better", "Ethan Stowell", 4,input);
        setup2 = new Review("This pizza is the BEEZ KNEEZ!", "Guy Fieri", 4.5,input);
        setup3 = new Review("Needs a bit of creme freich but otherwise absolutely nailed it.", "Gordon Ramsay", 5,input);
        setup4 = new Review("Utterly Scrumptious", "Mary Berry", 4.2,input);
        setup5 = new Review("Better than the prison pizza for sure.", "Martha Stewart", 4.4,input);

        input.addReview(setup1);
        input.addReview(setup2);
        input.addReview(setup3);
        input.addReview(setup4);
        input.addReview(setup5);

    }

    @Test
    public void toString_test() throws Exception{
        String expected = "Restaurant: name='roccos', stars=4.42, price_range='2\n" +
                ", reviews=[4.0 Stars.  This place is pretty good. My pizza is better\n" +
                " was written by: Ethan Stowell., 4.5 Stars.  This pizza is the BEEZ KNEEZ!\n" +
                " was written by: Guy Fieri., 5.0 Stars.  Needs a bit of creme freich but otherwise absolutely nailed it.\n" +
                " was written by: Gordon Ramsay., 4.2 Stars.  Utterly Scrumptious\n" +
                " was written by: Mary Berry., 4.4 Stars.  Better than the prison pizza for sure.\n" +
                " was written by: Martha Stewart.]";
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