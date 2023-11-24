import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.format.DateTimeParseException;

public class DateConverterTest {
    //positive tests
    @Test
    public void testConvertDate_Success() {
        String inputDate = "01-01-2020";
        String inputFormat = "dd-MM-yyyy";
        String outputFormat = "yyyy-MM-dd";
        String expectedDate = "2020-01-01";
        String result = DateConverter.convertDate(inputDate, inputFormat, outputFormat);
        Assertions.assertEquals(expectedDate, result);
    }

    @Test
    public void testDetectDateFormat_Success() {
        String dateStr = "01 January 2020";
        String expectedFormat = "dd MMMM yyyy";
        String result = DateConverter.detectDateFormat(dateStr);
        Assertions.assertEquals(expectedFormat, result);
    }

    @Test
    public void testConvertDateUsingDetectedFormat_Success() {
        String dateStr = "12/31/2020";
        String detectedFormat = DateConverter.detectDateFormat(dateStr);
        String outputFormat = "yyyy-MM-dd";
        String expectedDate = "2020-12-31";
        String result = DateConverter.convertDate(dateStr, detectedFormat, outputFormat);
        Assertions.assertEquals(expectedDate, result);
    }

    //negative tests
    @Test
    public void testConvertDate_InvalidInputFormat() {
        Assertions.assertThrows(DateTimeParseException.class, () -> {
            String inputDate = "01-01-2020";
            String inputFormat = "invalid-format"; // Некоректний вхідний формат
            String outputFormat = "yyyy-MM-dd";
            DateConverter.convertDate(inputDate, inputFormat, outputFormat);
        });
    }
    @Test
    public void testConvertDate_InvalidOutputFormat() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String inputDate = "01-01-2020";
            String inputFormat = "dd-MM-yyyy";
            String outputFormat = "yyyy/MM/dd"; // Некоректний вихідний формат
            DateConverter.convertDate(inputDate, inputFormat, outputFormat);
        });
    }
    @Test
    public void testConvertDate_InvalidDate() {
        Assertions.assertThrows(DateTimeParseException.class, () -> {
            String inputDate = "31-02-2020"; // Неправильна дата
            String inputFormat = "dd-MM-yyyy";
            String outputFormat = "yyyy-MM-dd";
            DateConverter.convertDate(inputDate, inputFormat, outputFormat);
        });
    }


}
