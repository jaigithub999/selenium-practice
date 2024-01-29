package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver print = new FirefoxDriver();

		
		print.get("http://www.greenstechnologys.com");
		
		print.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement closebutton = print.findElement(By.xpath("//button[@class='close']"));
		
		
		closebutton.click();
		
		Thread.sleep(4000);
		
		WebElement greenstext = print.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		String text = greenstext.getText();
		
		System.out.println(text);
		
		
		
		
		
		
	}

}
