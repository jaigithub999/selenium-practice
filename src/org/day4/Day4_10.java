package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver flipkart = new FirefoxDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		WebElement fliplogin = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		fliplogin.click();
		
		WebElement flipkartSearch = flipkart.findElement(By.xpath("//input[@class='_3704LK']"));
		flipkartSearch.sendKeys("men's dresses");
		
		WebElement flipkartSearchBtn = flipkart.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		flipkartSearchBtn.click();
		

	}
}
