package task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonIphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("iphone");
		WebElement searchBoxBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchBoxBtn.click();
		List<WebElement> images = driver.findElements(By.xpath("//img[@class='s-image']"));
		System.out.println("No of Iphone images " + images.size());
	}
}
