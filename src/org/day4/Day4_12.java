package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver shopclues = new FirefoxDriver();

		shopclues.get("https://www.shopclues.com/wholesale.html ");
		
		shopclues.manage().window().maximize();
		
		WebElement shopClues = shopclues.findElement(By.xpath("//input[@onfocus='autoComplete()']"));
		shopClues.sendKeys("laptop");
		WebElement searchbutton = shopclues.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		searchbutton.click();

		WebElement searchProduct = shopclues.findElement(By.xpath("//h2[text()='Dell Inspiron 7400 14.5 QHD+ IPS Anti Glare Display 11t']"));
		searchProduct.click();
		
	}
}
