package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SauceDemoLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();         
        driver.manage().window().maximize(); 
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000); 
        driver.quit();     
    }

    @Test(dataProvider = "loginData", dataProviderClass = SauceDemoDataProvider.class)
    public void loginTest(String username, String password, String expected) {

        
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

       
        driver.findElement(By.id("login-button")).click();

     
        if (expected.equals("success")) {
          
            String currentUrl = driver.getCurrentUrl();
          
            Assert.assertTrue(
                currentUrl.contains("inventory"),
                "Login failed for valid user: " + username + " | Current URL: " + currentUrl
            );
            System.out.println(" Login successful for user: " + username);

        } else if (expected.equals("locked")) {
           
            String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(
                errorMsg.toLowerCase().contains("locked out"),
                "Expected 'locked out' error, but got: " + errorMsg
            );
            System.out.println(" User locked out as expected: " + username);

        } else if (expected.equals("invalid")) {
           
            String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(
                errorMsg.toLowerCase().contains("do not match"),
                "Expected invalid login error ('do not match'), but got: " + errorMsg
            );
            System.out.println(" Invalid login as expected for user: " + username);

        } else {
          
            Assert.fail("Unknown expected flag: " + expected + ". Use 'success' | 'locked' | 'invalid'.");
        }
    }
}


