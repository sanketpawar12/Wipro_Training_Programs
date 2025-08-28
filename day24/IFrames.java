package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrames {
	WebDriver driver;
	@Test
	public void handleIframesTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iframe);
		
		WebElement textBox = driver.findElement(By.id("tinymce"));
		textBox.clear();
		textBox.sendKeys("Hello, TestNG with IFrame!");
		
		
		driver.switchTo().defaultContent();
	}
}
