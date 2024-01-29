package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_8{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver adaction = new FirefoxDriver();

		
		adaction.get("http://adactinhotelapp.com/");
		
		adaction.manage().window().maximize();
		
		WebElement userId = adaction.findElement(By.xpath("(//input[@type='text'])[1]"));
		userId.sendKeys("jai.selvam@1234");
		
		String user = userId.getAttribute("value");
		System.out.println(user);
		

		WebElement userpass = adaction.findElement(By.xpath("//input[@type='password']"));
		userpass.sendKeys("4123");
		String userPassWord = userpass.getAttribute("value");
		System.out.println(userPassWord);
	}
}