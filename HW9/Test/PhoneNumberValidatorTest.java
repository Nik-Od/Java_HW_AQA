package HW9.Test;

import org.testng.annotations.Test;
import org.testng.Assert;
public class PhoneNumberValidatorTest {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+38\\(0\\d{2}\\)\\d{7}");
    }

    @Test
    public void testIsValidPhoneNumber() {
        assertTrue(isValidPhoneNumber("+38(012)3456789"));
        assertFalse(isValidPhoneNumber("012-3456789"));
        assertFalse(isValidPhoneNumber("+380123456789"));
        assertFalse(isValidPhoneNumber("+38(012)345678"));
    }

}
