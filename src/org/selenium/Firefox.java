package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.amazon.in");

		WebDriver driver3 = new FirefoxDriver();
		driver3.get("https://www.facebook.com/");

		WebDriver driver4 = new FirefoxDriver();
		driver4.get("http://www.greenstechnologys.com/");

		WebDriver driver2 = new FirefoxDriver();

		driver2.get("technologys-http://greenstech.in/selenium-course-content.html");

	}
}
