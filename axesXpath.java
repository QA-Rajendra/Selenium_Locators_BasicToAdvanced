import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();

        // ===== parent:: =====
        WebElement emailParent = driver.findElement(By.xpath("//input[@id='input-email']/parent::div"));
        System.out.println("Parent tag of email input: " + emailParent.getTagName());

        // ===== child:: =====
        WebElement childInput = driver.findElement(By.xpath("//div[@class='form-group required']/child::input"));
        childInput.sendKeys("test@example.com");

        // ===== ancestor:: =====
        WebElement formAncestor = driver.findElement(By.xpath("//input[@id='input-password']/ancestor::form"));
        System.out.println("Form tag name: " + formAncestor.getTagName());

        // ===== descendant:: =====
        WebElement anyDescendant = driver.findElement(By.xpath("//form[@action][1]/descendant::input[@id='input-password']"));
        anyDescendant.sendKeys("password123");

        // ===== following:: =====
        WebElement afterLabelInput = driver.findElement(By.xpath("//label[@for='input-email']/following::input[1]"));
        afterLabelInput.clear();

        // ===== preceding:: =====
        WebElement beforeInputLabel = driver.findElement(By.xpath("//input[@id='input-password']/preceding::label[1]"));
        System.out.println("Label before password input: " + beforeInputLabel.getText());

        // ===== following-sibling:: =====
        WebElement siblingInput = driver.findElement(By.xpath("//label[@for='input-password']/following-sibling::input"));
        siblingInput.clear();

        // ===== preceding-sibling:: =====
        WebElement siblingLabel = driver.findElement(By.xpath("//input[@id='input-password']/preceding-sibling::label"));
        System.out.println("Sibling label text: " + siblingLabel.getText());

        driver.quit();
    }
}
