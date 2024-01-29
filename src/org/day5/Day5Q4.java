package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q4 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver shopclues = new FirefoxDriver();
		
		shopclues.get("https://www.shopclues.com/wholesale.html");
		
		shopclues.manage().window().maximize();
		
		
		
		WebElement mobileElctro = shopclues.findElement(By.xpath("//a[text()='Mobiles & More']"));
		
		
		Actions a = new Actions(shopclues);
		
		a.moveToElement(mobileElctro).perform();
		
		
		WebElement smartPhoneTablets = shopclues.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		smartPhoneTablets.click();
		
		
		Thread.sleep(5000);
		
		
		WebElement checBox = shopclues.findElement(By.xpath("//*[@id=\"sort_price_fct\"]/li[4]/label"));
		checBox.click();
		
		

}
}