package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

////				9. textbox only.
//	
//				WebDriver driver9 = new ChromeDriver();
//				driver9.get("http://demo.automationtesting.in/Register.html");
//				
//				driver9.manage().window().maximize();
//				
//				WebElement findElement = driver9.findElement(By.xpath("(//input[@type='text'])[1]"));
//				findElement.sendKeys("jayaselvam");
//				
//				
//				WebElement findElement2 = driver9.findElement(By.xpath("(//input[@type='text'])[2]"));
//				findElement2.sendKeys("joseph");
//	
//				
				WebDriver snapdeal = new ChromeDriver();

				snapdeal.get("https://www.snapdeal.com/");

				snapdeal.manage().window().maximize();

				WebElement flipkartsign = snapdeal.findElement(By.xpath("(//div[@class='accountInner'])"));

				flipkartsign.click();
	
				
	}
}
