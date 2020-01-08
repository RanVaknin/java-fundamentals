package basiclibrary;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateTest {
    @Test
    public void duplicateTest() {
        Duplicates test1 = new Duplicates();

        int[] input = new int[]{1, 2, 3, 4, 7,7};
        boolean expected = true;

        Assert.assertTrue(Duplicates.containsDuplicates(input));
    }
}

