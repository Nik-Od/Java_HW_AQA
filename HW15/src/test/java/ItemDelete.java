import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class ItemDelete {



    @Test
    public void testRemovingItemFromCart() {
        WebDriverManager.chromedriver();


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bstackdemo.com/");


        // Додавання товару
        driver.findElement(By.xpath("//div[contains(@class,'shelf-item') and .//p[contains(text(),'iPhone 12 Pro Max')]]//div[contains(@class,'shelf-item__buy-btn')]")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


        // Видалення товару
        driver.findElement(By.xpath("//div[@class='shelf-item__del']")).click();

        // Перевірка, що корзина порожня
        WebElement emptyCartMessage = driver.findElement(By.xpath("//p[@class='shelf-empty']"));
        Assert.assertTrue(emptyCartMessage.isDisplayed(), "Cart is not empty after removing the item");

        driver.quit();
    }

}
