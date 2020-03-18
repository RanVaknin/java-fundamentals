import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    MultiBracketValidation test;

    @Before
    public void setup(){
        test = new MultiBracketValidation();
    }

    @Test
    public void validateBrackets_test() {
        Assert.assertTrue(test.validateBrackets("[]()"));
        Assert.assertTrue(test.validateBrackets("[{}]"));
        assertFalse(test.validateBrackets("[({}]"));
        Assert.assertTrue(test.validateBrackets("()[[Extra Characters]]	"));
        Assert.assertTrue(test.validateBrackets("(){}[[]]"));
        Assert.assertTrue(test.validateBrackets(""));
        Assert.assertTrue(test.validateBrackets("{}{Code}[Fellows](())"));
    }
}