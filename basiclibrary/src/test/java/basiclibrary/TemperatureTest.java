package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {
    @Test public void temperatureTest(){
        int[][] input = new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expected = "Never saw temperature: 63 \n" +
                "Never saw temperature: 67 \n" +
                "Never saw temperature: 68 \n" +
                "Never saw temperature: 69";

        String actual = Temperature.findMinMax(input);
        Assert.assertEquals(expected,actual);

    }
}
