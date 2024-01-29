package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver flipkart = new FirefoxDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();
		

		WebElement fliplogin = flipkart.findElement(By.xpath("(//input[@autocomplete='off']) [2]"));
		fliplogin.sendKeys("jai.selvam@gmail.com");
		String userName = fliplogin.getAttribute("value");
		
		System.out.println(userName);
		
		
		
		
	}
}