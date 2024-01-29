package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q20 {
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

		WebElement tvApplainces = flipkart.findElement(By.xpath("//div[text()='TVs & Appliances']"));

		tvApplainces.click();
		

		WebElement tvApplainces1 = flipkart.findElement(By.xpath("//span[text()='TVs & Appliances']"));

		a.moveToElement(tvApplainces1).perform();
		
		Thread.sleep(1000);
		WebElement miTv = flipkart.findElement(By.xpath("//a[text()='Mi']"));

		miTv.click();
		
		
		Thread.sleep(1000);
		WebElement miTvFirst = flipkart.findElement(By.xpath("//div[text()='Mi 5A 108 cm (43 inch) "
				+ "Full HD LED Smart Android TV with Dolby Audio (2022 Model)']"));

		miTvFirst.click();
		
		
		
		
}
}