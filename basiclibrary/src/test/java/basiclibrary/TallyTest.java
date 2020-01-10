package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        input.add("Bush");
        input.add("Bush");
        input.add("Shrub");
        input.add("Shrub");
        input.add("Zebra");
        input.add("Zebra");

        String expected = "No winner";
        String actual = Tally.tally(input);
        Assert.assertEquals(expected,actual);

    }
}
