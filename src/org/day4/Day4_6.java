package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_6{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver fb = new FirefoxDriver();

		
		fb.get("https://www.facebook.com/ ");
		
		fb.manage().window().maximize();
		
		WebElement userId = fb.findElement(By.xpath("//input[@type='text']"));
		userId.sendKeys("jai.selvam@1234");
		
		String user = userId.getAttribute("value");
		System.out.println(user);
		

		WebElement userpass = fb.findElement(By.xpath("//input[@type='password']"));
		userpass.sendKeys("12345678");
		String userPassWord = userpass.getAttribute("value");
		System.out.println(userPassWord);
	}
}