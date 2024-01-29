package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
		
		// 1.FACBOOK LAUNCH

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jai.selvam.31");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("jayaselvam@123");

		// 2.REDBUS LAUNCH

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.redbus.in/");

		WebElement from = driver1.findElement(By.id("src"));
		from.sendKeys("Chennai");

		WebElement to = driver1.findElement(By.id("dest"));
		to.sendKeys("Trichy");

		// 3.Google search

		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com/");

		WebElement search = driver2.findElement(By.name("q"));
		search.sendKeys("GreensTechnology");

		// 4.Launch ICIC Bank

		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://infinity.icicibank.com/corp/Login.jsp");

		WebElement bank = driver3.findElement(By.name("DUMMY1"));
		bank.sendKeys("Java@124");

		// 6.SWIGGY

		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.swiggy.com/");

		WebElement swiggy = driver5.findElement(By.id("location"));
		swiggy.sendKeys("perumbakkam");

		// 7.SNAPDEAL

		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.snapdeal.com/login");

		WebElement snapuserid = driver6.findElement(By.id("userName"));
		snapuserid.sendKeys("jaya@gmail.com");


		// 10.Adaction

		WebDriver driver8 = new ChromeDriver();
		driver8.get("http://adactinhotelapp.com/");

		WebElement adactionuser = driver8.findElement(By.id("username"));
		adactionuser.sendKeys("yaser@gmail.com");

		WebElement adactioanpass = driver8.findElement(By.id("password"));
		adactioanpass.sendKeys("1234567");
	}

}
