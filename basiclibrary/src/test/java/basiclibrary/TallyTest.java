package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TallyTest {

    @Test
    public void Testies(){
        ArrayList<String> input = new ArrayList<>();
        input.add("Bush");
        input.add("Bush");
        input.add("Bush");
        input.add("Shrub");
        input.add("Hedge");
        input.add("Shrub");
        input.add("Bush");
        input.add("Hedge");
        input.add("Bush");

        String expected = "Bush received the most votes!";
        String actual = Tally.tally(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Testies2(){
        ArrayList<String> input = new ArrayList<>();
        input.add("Arigato");
        input.add("Arigato");
        input.add("Roboto");
        input.add("Roboto");
        input.add("Domo");

        String expected = "We have a tie between: Roboto & Arigato";
        String actual = Tally.tally(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testies3(){
        ArrayList<String> input = new ArrayList<>();
        String expected = "No Candidates!";
        String actual = Tally.tally(input);
        Assert.assertEquals(expected,actual);
    }
}
