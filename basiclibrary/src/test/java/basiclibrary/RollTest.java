package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

public class RollTest {
    @Test public void rollTest(){
        Roll test = new Roll();

        int input = 3;
        int expected = 3;

        int result = test.rollDice(3).length;
        System.out.println("result = " + result);

        int[] rangeArray = test.rollDice(3);
        int high = 6;
        int low = 1;

        Assert.assertEquals(expected,result);

        for(int i = 0; i < input; i++){
            Assert.assertTrue("Error, roll is too high", high >= rangeArray[i]);
            Assert.assertTrue("Error, roll is too low", low <= rangeArray[i]);

        }
    }
}
