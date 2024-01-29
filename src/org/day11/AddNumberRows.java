package org.day11;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddNumberRows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromdriver.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://adactinhotelapp.com/");

		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("jayaselvam");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("234548");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login']"));
		loginBtn.click();
		
			}

		

	}
