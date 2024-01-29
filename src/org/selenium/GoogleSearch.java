package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		
		// 8.INSTAGRAM

		WebDriver driver7 = new ChromeDriver();
		driver7.get("https://www.instagram.com/accounts/login/");

		WebElement instauser = driver7.findElement(By.name("username"));
		instauser.sendKeys("jayaselvam");

		WebElement instapass = driver7.findElement(By.name("password"));
		instapass.sendKeys("879675654545");

	}
}
