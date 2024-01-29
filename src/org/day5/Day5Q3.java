package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q3 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver flipkart = new FirefoxDriver();
		
		flipkart.get("http://www.flipkart.com");
		
		flipkart.manage().window().maximize();
		
		WebElement fliplogin = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		fliplogin.click();
		
		WebElement flipkartSearch = flipkart.findElement(By.xpath("//input[@class='_3704LK']"));
		flipkartSearch.sendKeys("furniture");
		
		WebElement flipkartSearchBtn = flipkart.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		flipkartSearchBtn.click();
		
		Actions a = new Actions(flipkart);
		
		
		
		WebElement txtFurniture = flipkart.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		a.moveToElement(txtFurniture).perform();
		
		Thread.sleep(2000);
		WebElement txtTowels = flipkart.findElement(By.xpath("(//a[text()='Bath Towels'])[1]"));
		txtTowels.click();
		
		
		Thread.sleep(2000);
		
		WebElement txtTowelsNew = flipkart.findElement(By.xpath("//a[text()='VEL Cotton 200 GSM Bath Towel' and@title='VEL Cotton 200 GSM Bath Towel']"));
		txtTowelsNew.click();
		
		String text = txtTowelsNew.getText();
		
		System.out.println(text);
		
			}
	
	

}
