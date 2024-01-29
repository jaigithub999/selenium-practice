package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver snapdeal = new FirefoxDriver();

		snapdeal.get("https://www.snapdeal.com/");
		
		snapdeal.manage().window().maximize();
		
		WebElement snapdealSearch = snapdeal.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		snapdealSearch.sendKeys("laptop");
		WebElement searchbutton = snapdeal.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchbutton.click();

	}
}
