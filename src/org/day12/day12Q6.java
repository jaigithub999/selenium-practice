package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day12Q6 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.edge.driver","C:\\Users\\jayaselvamjai\\eclipse-workspace"
				+ "\\SeleniumClass\\Drivers\\msedgedriver.exe" );
		
		WebDriver flipkart = new EdgeDriver();
		
		flipkart.get("https://www.flipkart.com/");
		
		flipkart.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)flipkart;
		
		WebElement loginBtn = flipkart.findElement(By.xpath("//a[text()='Login']"));
		js.executeScript("arguments[0].click()", loginBtn);
		
		WebElement logUserId = flipkart.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		
		js.executeScript("arguments[0].setAttribute('value','6362622023')", logUserId);
		
		Object o = js.executeScript("return arguments[0].getAttribute('value')",logUserId);
		
		
		String s = (String)o;
		System.out.println(s);
		
		
		
		WebElement logIn = flipkart.findElement(By.xpath("//button[text()='Request OTP']"));
		js.executeScript("arguments[0].click()", logIn);
		
		
		
		
		
		
		
		
		
	}

}
