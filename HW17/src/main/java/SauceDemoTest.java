import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SauceDemoTest {
    @Test
    public void testCaseForLinkedinButton(){
        WebDriverManager.chromedriver();


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // 1) Залогінитися
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        // 2) Знайти лінку на Linkedin та клікнути на неї
        WebElement linkedInLink = driver.findElement(By.cssSelector(".social_linkedin a"));
        linkedInLink.sendKeys(Keys.CONTROL, Keys.RETURN);

        // 3) Перевірити title нової таби
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        driver.close();

        // 4) Повернутися на головну табу
        driver.switchTo().window(tabs.get(0));

        // 5) Вийти з системи
        driver.findElement(By.id("react-burger-menu-btn")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link"))).click();
        driver.quit();
    }
}
