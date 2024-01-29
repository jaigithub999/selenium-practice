package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();

		WebElement allcountryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(allcountryDropDown);
		
		List<WebElement> allCountry = s.getOptions();
		System.out.println(": All Country Present In The CountryDropDown :");
		for (int i = 0; i < allCountry.size(); i++) {
			System.out.println(allCountry.get(i).getText());
			
		}
}
}