package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();

		driver1.get("http://www.greenstechnologys.com/");

		WebDriver driver2 = new ChromeDriver();
		driver2.get("http://gmail.com/");

		WebDriver driver3 = new ChromeDriver();
		driver3.get("http://www.flipkart.com/");

		WebDriver driver4 = new ChromeDriver();
		driver4.get("http://greenstech.in/selenium-course-content.html");

	}
}
