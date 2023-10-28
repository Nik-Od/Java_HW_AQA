package HW9.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
public class StringModifierTest {
    public static String removeChars(String str, char... charsToRemove) {
        StringBuilder pattern = new StringBuilder("[");
        for (char ch : charsToRemove) {
            pattern.append(ch);
        }
        pattern.append("]");
        return str.replaceAll(pattern.toString(), "");
    }

    @Test
    public void testRemoveChars() {
        assertEquals("bc4efbc12ebc", removeChars("abcd4efabc123deabcdaaa", 'a', 'd', '3'));
        assertEquals("abcdef", removeChars("abcdef", 'x', 'y', 'z'));
        assertEquals("", removeChars("", 'a', 'b', 'c'));
    }

}
