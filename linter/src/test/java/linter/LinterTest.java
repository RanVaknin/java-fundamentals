package linter;

import jdk.nashorn.internal.runtime.regexp.joni.Option;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class LinterTest {
    @Test
    public void semicolonLinter() throws FileNotFoundException {
        String input = "resources/gates.js";
        String expected = "line 3: Missing semicolon.\n" +
                "line 5: Missing semicolon.\n" +
                "line 11: Missing semicolon.\n" +
                "line 13: Missing semicolon.\n" +
                "line 15: Missing semicolon.\n" +
                "line 26: Missing semicolon.\n" +
                "line 28: Missing semicolon.\n" +
                "line 32: Missing semicolon.\n" +
                "line 36: Missing semicolon.\n" +
                "line 40: Missing semicolon.\n" +
                "line 41: Missing semicolon.\n" +
                "line 50: Missing semicolon.\n" +
                "line 51: Missing semicolon.\n" +
                "line 59: Missing semicolon.\n" +
                "line 60: Missing semicolon.\n" +
                "line 61: Missing semicolon.\n" +
                "line 62: Missing semicolon.\n" +
                "line 64: Missing semicolon.\n" +
                "line 70: Missing semicolon.\n" +
                "line 71: Missing semicolon.\n" +
                "line 72: Missing semicolon.\n" +
                "line 73: Missing semicolon.\n" +
                "line 74: Missing semicolon.\n" +
                "line 76: Missing semicolon.\n" +
                "line 77: Missing semicolon.\n" +
                "line 78: Missing semicolon.\n" +
                "line 79: Missing semicolon.\n" +
                "line 80: Missing semicolon.\n" +
                "line 82: Missing semicolon.\n" +
                "line 83: Missing semicolon.\n" +
                "line 84: Missing semicolon.\n" +
                "line 85: Missing semicolon.\n" +
                "line 86: Missing semicolon.\n" +
                "line 88: Missing semicolon.\n" +
                "line 89: Missing semicolon.\n" +
                "line 90: Missing semicolon.\n" +
                "line 91: Missing semicolon.\n" +
                "line 92: Missing semicolon.\n" +
                "line 94: Missing semicolon.\n" +
                "line 95: Missing semicolon.\n" +
                "line 96: Missing semicolon.\n" +
                "line 97: Missing semicolon.\n" +
                "line 98: Missing semicolon.\n" +
                "line 99: Missing semicolon.\n" +
                "line 100: Missing semicolon.\n" +
                "line 101: Missing semicolon.";
        String actual = Linter.linter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fewErrorsTest() throws FileNotFoundException {
        String input = "resources/fewErros.js";
        String expected = "line 5: Missing semicolon.\n" +
                "line 13: Missing semicolon.\n" +
                "line 15: Missing semicolon.\n" +
                "line 26: Missing semicolon.";
        String actual = Linter.linter(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneErrorTest() throws FileNotFoundException {
        String input = "resources/oneError.js";
        String expected = "line 10: Missing semicolon.";
        String actual = Linter.linter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void noErrorTest() throws FileNotFoundException {
        String input = "resources/noErrors.js";
        String expected = "";
        String actual = Linter.linter(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void emptyFileTest() throws FileNotFoundException {
        String input = "resources/empty.js";
        String expected = "File is empty.";
        String actual = Linter.linter(input);
        Assert.assertEquals(expected, actual);
    }
}
