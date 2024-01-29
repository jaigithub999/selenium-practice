package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://output.jsbin.com/osebed/2");

		driver.manage().window().maximize();

		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		List<WebElement> option = s.getOptions();

		/*
		 * for (int i = 0; i < option.size(); i += 2) { s.selectByIndex(i); }
		 */

		for (int i = 0; i < option.size(); i++) {
			if (i % 2 == 0) {
				s.selectByIndex(i);
			}
		}
		System.out.println("Even Option Available");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			String text = allSelectedOptions.get(i).getText();
			System.out.println(text);
		}
	}
}
