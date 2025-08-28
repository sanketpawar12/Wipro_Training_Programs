package day26;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

public class SyncExceptionTest {
    private static final Logger logger = LogManager.getLogger(SyncExceptionTest.class);

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        logger.info("Launching the browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/");
        logger.info("Navigated to ParaBank login page");
    }

    @Test
    public void testLogin() {
        try {
            logger.info("Starting login test");

            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            username.sendKeys("Siya12");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Siya12");

            WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
            loginBtn.click();

            WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
            Assert.assertTrue(logoutLink.isDisplayed(), "Login failed!");

            logger.info("Login successful, Logout link found!");
            System.out.println("✅ Login successful, Logout link found!");
        } catch (NoSuchElementException e) {
            logger.error("Element not found", e);
            Assert.fail("Test failed due to missing element.");
        } catch (TimeoutException e) {
            logger.error("Timeout while waiting", e);
            Assert.fail("Test failed due to timeout.");
        } catch (Exception e) {
            logger.error("Unexpected error", e);
            Assert.fail("Test failed due to unexpected exception.");
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            logger.info("Closing the browser");
            driver.quit();
        }
    }
}
