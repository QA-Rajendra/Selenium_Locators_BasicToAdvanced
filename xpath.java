import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExamples {
    public static void main(String[] args) {
        // Set path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample site
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // ===== ABSOLUTE XPATH =====
        // ⚠️ Fragile — depends on exact structure
        WebElement logo = driver.findElement(By.xpath("/html/body/nav/div/div/a"));
        System.out.println("Logo found using Absolute XPath: " + logo.isDisplayed());

        // ===== RELATIVE XPATH =====
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys("Laptop");

        // ===== contains() =====
        WebElement cartBtn = driver.findElement(By.xpath("//button[contains(@onclick, 'cart')]"));
        cartBtn.click(); // Clicks the Cart button

        // ===== starts-with() =====
        WebElement myAccount = driver.findElement(By.xpath("//a[starts-with(@title, 'My')]"));
        myAccount.click();

        // ===== and condition =====
        WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/login' and text()='Login']"));
        loginLink.click();

        // ===== or condition =====
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='input-email' or @name='email']"));
        emailInput.sendKeys("test@example.com");

        // ===== text() =====
        WebElement forgottenPassword = driver.findElement(By.xpath("//a[text()='Forgotten Password']"));
        forgottenPassword.click();

        // ===== XPath with parent-child =====
        WebElement breadcrumb = driver.findElement(By.xpath("//ul[@class='breadcrumb']/li[1]/a"));
        System.out.println("Breadcrumb: " + breadcrumb.getText());

        // ===== Following-sibling =====
        // Navigate back to home
        driver.navigate().back();
        WebElement searchLabel = driver.findElement(By.xpath("//label[@for='input-search']/following-sibling::input"));
        searchLabel.sendKeys("Phone");

        // Close browser
        driver.quit();
    }
}
