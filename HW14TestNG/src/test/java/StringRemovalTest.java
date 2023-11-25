import HW9.StringRemoval;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringRemovalTest {

    @Test
    public void testRemoveSubString_Positive() {
        Assert.assertEquals(StringRemoval.removeSubString("This is the test string", "st"), "This is the te ring");
    }

    @Test
    public void testRemoveSubString_NotFound() {
        Assert.assertEquals(StringRemoval.removeSubString("Hello, World!", "XYZ"), "Hello, World!");
    }

    @Test
    public void testRemoveSubString_EmptyRemovable() {
        Assert.assertEquals(StringRemoval.removeSubString("Hello, World!", ""), "Hello, World!");
    }
    @Test
    public void testRemoveSubString_MainStringNull() {
        Assert.assertNull(StringRemoval.removeSubString(null, "test"));
    }

    @Test
    public void testRemoveSubString_RemovableStringNull() {
        Assert.assertEquals(StringRemoval.removeSubString("Hello, World!", null), "Hello, World!");
    }

}
