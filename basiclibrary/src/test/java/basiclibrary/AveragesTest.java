package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

public class AveragesTest {
    @Test public void averagesTest(){
        Averages test1 = new Averages();

        int[] input = new int[]{1,3,5};
        double expected = 3;

        double actual = test1.calculateAverages(input);
        Assert.assertEquals(expected,actual,0.001);

    }

    @Test public void nestedAverageTest(){
        Averages test2 = new Averages();

        int[][] input = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        double expected = 57.0;
        double actual = test2.averageOfAllArrays(input);

        Assert.assertEquals(expected,actual,0.001);
    }
}
