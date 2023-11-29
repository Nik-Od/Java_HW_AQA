import HW9.ReverseString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTest {


    @Test(groups = {"positive"})
    public void testReverseString_Positive() {
        Assert.assertEquals(ReverseString.reverseString("Java, World!"), "!dlroW ,avaJ");
        Assert.assertEquals(ReverseString.reverseString("abcd"), "dcba");
    }

    @Test
    public void testReverseString_EmptyString() {
        Assert.assertEquals(ReverseString.reverseString(""), "");
    }

    @Test(groups = {"negative"})
    public void testReverseString_Null() {
        Assert.assertNull(ReverseString.reverseString(null));
    }

    @Test
    public void testReverseString_SpecialCharacters() {
        Assert.assertEquals(ReverseString.reverseString("!@#$%^&*()"), ")(*&^%$#@!");
    }

    @Test
    public void testReverseString_Numbers() {
        Assert.assertEquals(ReverseString.reverseString("12345"), "54321");
    }

}
