package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q17 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver flipkart = new FirefoxDriver();
		
		flipkart.get("https://www.flipkart.com/");
		
		flipkart.manage().window().maximize();
		
		WebElement fliplogin = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		fliplogin.click();
		
		
		WebElement womensFashion = flipkart.findElement(By.xpath("//div[text()='Fashion']"));
		womensFashion.click();
		
		
		WebElement womensOptionBtn = flipkart.findElement(By.xpath("//span[text()='Women']"));
		
		Actions a = new Actions(flipkart);
		
		a.moveToElement(womensOptionBtn).perform();
		
		Thread.sleep(2000);
		WebElement heelsTxt = flipkart.findElement(By.xpath("(//a[text()='Flats'])[1]"));
		heelsTxt.click();
}
}