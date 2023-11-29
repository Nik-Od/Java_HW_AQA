import HW9.StringModifier;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringModifierTest {

    @Test(groups = {"positive"})
    public void testRemoveCharacters_Positive() {
        Assert.assertEquals(StringModifier.removeCharacters("abcd4efabc123deabcdaaa", "ad3"), "bc4efbc12ebc");
    }

    @Test
    public void testRemoveCharacters_NotFound() {
        Assert.assertEquals(StringModifier.removeCharacters("Hello, World!", "xyz"), "Hello, World!");
    }

    @Test
    public void testRemoveCharacters_EmptyCharsToRemove() {
        Assert.assertEquals(StringModifier.removeCharacters("Hello, World!", ""), "Hello, World!");
    }
    @Test(groups = {"negative"})
    public void testRemoveCharacters_EmptyInputString() {
        Assert.assertEquals(StringModifier.removeCharacters("", "abc"), "");
    }

    @Test(groups = {"negative"})
    public void testRemoveCharacters_InputStringNull() {
        Assert.assertNull(StringModifier.removeCharacters(null, "abc"));
    }

}
