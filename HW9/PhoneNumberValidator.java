package HW9;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {

    // Регулярний вираз для перевірки формату номера телефона
    private static final String PHONE_PATTERN = "\\+38\\(0\\d{2}\\)\\d{7}";

    public static void main(String[] args) {
        String[] phoneNumbers = {
                "+38(099)1234567",
                "+38(010)1234567",
                "+38099)12345678",
                "+380(099)123456",
                "380(099)1234567"
        };

        for (String phoneNumber : phoneNumbers) {
            if (isValid(phoneNumber)) {
                System.out.println(phoneNumber + " is a valid phone number.");
            } else {
                System.out.println(phoneNumber + " is not a valid phone number.");
            }
        }
    }

    public static boolean isValid(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

