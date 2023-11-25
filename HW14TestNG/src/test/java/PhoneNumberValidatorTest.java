import HW9.PhoneNumberValidator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PhoneNumberValidatorTest {

    @DataProvider(name = "phoneNumbers")
    public Object[][] createPhoneNumbers() {
        return new Object[][]{
                {"+38(099)1234567", true},
                {"+38(010)1234567", true},
                {"+38099)12345678", false},
                {"+380(099)123456", false},
                {"380(099)1234567", false}
        };
    }

    @Test(dataProvider = "phoneNumbers")
    public void testIsValid(String phoneNumber, boolean expected) {
        Assert.assertEquals(PhoneNumberValidator.isValid(phoneNumber), expected);
    }
    @Test
    public void testIsValid_EmptyPhoneNumber() {
        Assert.assertFalse(PhoneNumberValidator.isValid(""));
    }

    @Test
    public void testIsValid_PhoneNumberWithLetters() {
        Assert.assertFalse(PhoneNumberValidator.isValid("+38(099)abc4567"));
    }

    @Test
    public void testIsValid_NullPhoneNumber() {
        Assert.assertFalse(PhoneNumberValidator.isValid(null));
    }

}
