package task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("www.facebook.com/");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("jai");
	
	
	
	}
}
