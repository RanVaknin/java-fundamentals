package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review input;

    @Before
    public void setUp() throws Exception {
        input = new Review("The best pizza I have ever had on the West Coast.", "Ethan Stowell", 5);
    }

    @Test
    public void testToString() {
        String expected = "5 Stars.  The best pizza I have ever had on the West Coast.\n was written by: Ethan Stowell.";
        String actual = input.toString() ;
    }
}