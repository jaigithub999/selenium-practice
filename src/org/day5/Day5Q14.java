package org.day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q14 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver snapdeal = new FirefoxDriver();
		
		snapdeal.get("https://www.snapdeal.com/");
		
		snapdeal.manage().window().maximize();
		
		WebElement womensFashion = snapdeal.findElement(By.xpath("(//span[@class='catText'])[2]"));
		
		Actions a = new Actions(snapdeal);
		
		a.moveToElement(womensFashion).perform();
		
		WebElement footWearTxt = snapdeal.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		
		footWearTxt.click();
		
		WebElement heels = snapdeal.findElement(By.xpath("//p[text()='Do Bhai Cream Block Heels']"));
		
		heels.click();
		
		
		
}
}