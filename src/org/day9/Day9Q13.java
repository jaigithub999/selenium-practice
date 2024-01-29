package org.day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/account/login");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
		
		
		
		
		
		
		// driver.get("http://output.jsbin.com/osebed/2");

		// driver.manage().window().maximize();
		// WebElement fruits = driver.findElement(By.id("fruits"));
		// Select s = new Select(fruits);
		// List<WebElement> allFruits = s.getOptions();
		// for (WebElement listFrits: allFruits) {
		// listFrits.click();
		// }
		// System.out.println("First Selected Option");
		// WebElement firstSelectedOption = s.getFirstSelectedOption();
		// System.out.println(firstSelectedOption.getText());

	}
}
