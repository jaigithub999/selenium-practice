package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskD2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		

		
		// 5.Launch HDFC Bank

				WebDriver driver4 = new ChromeDriver();
				driver4.get("https://netbanking.hdfcbank.com/");

				WebElement userid = driver4.findElement(By.name("fldLoginUserId"));
				userid.sendKeys("JaiHdfc@123");
				
		// 6.SWIGGY

		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.swiggy.com/");

		WebElement swiggy = driver5.findElement(By.id("location"));
		swiggy.sendKeys("perumbakkam");
		
		
//		7.SNAPDEAL
		
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.snapdeal.com/login");
		
		WebElement snapuserid = driver6.findElement(By.id("userName"));
		snapuserid.sendKeys("jaya@gmail.com");
		
//		
		
//		10.Adaction
		
		WebDriver driver8 = new ChromeDriver();
		driver8.get("http://adactinhotelapp.com/");
		
		WebElement adactionuser = driver8.findElement(By.id("username"));
		adactionuser.sendKeys("yaser@gmail.com");
		
		WebElement adactioanpass = driver8.findElement(By.id("password"));		
		adactioanpass.sendKeys("1234567");
	}
	
	
}
