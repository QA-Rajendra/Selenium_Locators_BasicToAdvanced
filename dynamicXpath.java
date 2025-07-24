import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPathExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // ===== Using contains() =====
        WebElement searchBox = driver.findElement(By.xpath("//input[contains(@name, 'search')]"));
        searchBox.sendKeys("Laptop");

        // ===== Using starts-with() =====
        WebElement cartBtn = driver.findElement(By.xpath("//button[starts-with(@onclick, 'cart.add')]"));
        cartBtn.click();

        // ===== Combining contains + other attributes =====
        WebElement addToCartBtn = driver.findElement(By.xpath("//button[contains(@onclick, 'product_id') and @type='button']"));
        addToCartBtn.click();

        // ===== Relative path using structure =====
        WebElement loginLink = driver.findElement(By.xpath("//div[@id='top-links']//a[contains(text(), 'Login')]"));
        loginLink.click();

        // Close the browser
        driver.quit();
    }
}
