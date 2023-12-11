import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ShoppingCartTest {

    @Test
    public void testAddingItemsToCart() {
        WebDriverManager.chromedriver();


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bstackdemo.com/");

        // Додавання першого товару
        driver.findElement(By.xpath("//div[contains(@class,'shelf-item') and .//p[contains(text(),'iPhone 12 Mini')]]//div[contains(@class,'shelf-item__buy-btn')]")).click();
        // Додавання другого товару
        driver.findElement(By.xpath("//div[contains(@class,'shelf-item') and .//p[contains(text(),'iPhone 12 Pro Max')]]//div[contains(@class,'shelf-item__buy-btn')]")).click();


        // Перевірка товарів у корзині
        WebElement cartItem1 = driver.findElement(By.xpath("//p[@class='title'][text()='iPhone 12 Mini']"));
        WebElement cartItem2 = driver.findElement(By.xpath("//p[@class='title'][text()='iPhone 12 Pro Max']"));

        Assert.assertTrue(cartItem1.isDisplayed(), "iPhone 12 Mini is not in the cart");
        Assert.assertTrue(cartItem2.isDisplayed(), "iPhone 12 Pro Max is not in the cart");

        // Перевірка загальної ціни
        WebElement totalPrice = driver.findElement(By.xpath("//p[@class='sub-price__val'][text()='$ 1798.00']"));
        Assert.assertTrue(totalPrice.isDisplayed(), "Checkout button is not available");

        // Перевірка наявності кнопки CHECKOUT
        WebElement checkoutButton = driver.findElement(By.xpath("//div[@class='buy-btn'][text()='Checkout']"));
        Assert.assertTrue(checkoutButton.isDisplayed(), "Checkout button is not available");

        driver.quit();
    }
}


