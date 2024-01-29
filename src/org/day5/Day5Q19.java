package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q19 {
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver flipkart = new FirefoxDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();
		Actions a = new Actions(flipkart);

		WebElement flipadCloseBtn = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		flipadCloseBtn.click();

		WebElement electronicsTxt = flipkart.findElement(By.xpath("//div[text()='Electronics']"));

		electronicsTxt.click();

		WebElement electronics = flipkart.findElement(By.xpath("//span[text()='Electronics']"));

		a.moveToElement(electronics).perform();
		
		
		Thread.sleep(2000);
		WebElement realmeOption = flipkart.findElement(By.xpath("//a[text()='Realme']"));
		realmeOption.click();
		
		
		Thread.sleep(3000);
		WebElement realmePhone = flipkart.findElement(By.xpath("//div[text()='realme C35 (Glowing Black, 64 GB)']"));
		realmePhone.click();
		
		
		

	}
}