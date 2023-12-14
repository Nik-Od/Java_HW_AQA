package Task2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class DynamicPageTest {
    @Test
    public void testDynamicContent() {
        WebDriverManager.chromedriver();


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");


        WebElement button1 = driver.findElement(By.id("adder"));
        button1.click();


        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(By.id("box0")));


        WebElement box = driver.findElement(By.id("box0"));
        Assert.assertTrue(box.isDisplayed(), "New element is not displayed after clicking the button 'Add new box'");

        WebElement button2 = driver.findElement(By.id("reveal"));
        button2.click();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("revealed")));

        WebElement inputField = driver.findElement(By.id("revealed"));
        Assert.assertTrue(inputField.isDisplayed(), "New element is not displayed after clicking the button 'Reveal new field'");

        driver.quit();
    }


}
