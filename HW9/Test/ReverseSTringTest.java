package HW9.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
public class ReverseSTringTest {
    public static String reverseString(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void testReverseString() {
        assertEquals("!dlroW ,avaJ", reverseString("Java, World!"));
        assertEquals("", reverseString(""));
        assertEquals("a", reverseString("a"));
    }

}
