package Day25;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        System.out.println("Launching the browser.");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }

    @Test(dataProvider = "getdata", dataProviderClass = ExcelDataProvider.class)
    public void login(String userName, String password) {
        System.out.println("Logging in with: " + userName + " / " + password);

        // Enter credentials
        wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            // Case 1: Successful login
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
            System.out.println("✅ Login successful for user: " + userName);
        } catch (Exception e) {
            // Case 2: Failed login
            String errorMsg = driver.findElement(By.xpath("//p[contains(text(),'Invalid credentials')]")).getText();
            System.out.println("❌ Login failed for user: " + userName + " | Message: " + errorMsg);
            Assert.fail("Login failed for user: " + userName + " | Message: " + errorMsg);
        }
    }
}
