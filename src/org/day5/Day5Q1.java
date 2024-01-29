package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver guru99 = new FirefoxDriver();

		guru99.get("http://demo.guru99.com/test/drag_drop.html ");

		guru99.manage().window().maximize();

		WebElement Text = guru99.findElement(By.xpath("//a[text()=' 5000']"));

		WebElement placeBox = guru99.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		Actions a = new Actions(guru99);
		

		a.dragAndDrop(Text, placeBox).perform();

		WebElement placeBox2 = guru99.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		

		a.dragAndDrop(Text, placeBox2).perform();
		
		WebElement bankTxt = guru99.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		
		
		
		WebElement accPlace = guru99.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		a.dragAndDrop(bankTxt, accPlace).perform();
		
		
		
		WebElement saleTxt = guru99.findElement(By.xpath("//li[@class='block15 ui-draggable' and @data-id='6']"));
		
		WebElement accPlace5 = guru99.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		
		
		a.dragAndDrop(saleTxt, accPlace5).perform();
	}
}