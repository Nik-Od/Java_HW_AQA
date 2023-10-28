package HW9.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
public class StringRemovalTest {
    public static String removeSubString(String mainStr, String subStr) {
        return mainStr.replace(subStr, "");
    }

    @Test
    public void testRemoveSubString() {
        assertEquals("This is the te ring", removeSubString("This is the test string", "st"));
        assertEquals("abcdef", removeSubString("abcdef", "xyz"));
        assertEquals("", removeSubString("abcdef", "abcdef"));
    }

}
