package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day12Q5 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.edge.driver","C:\\Users\\jayaselvamjai\\eclipse-workspace"
				+ "\\SeleniumClass\\Drivers\\msedgedriver.exe" );
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement userIdBox = driver.findElement(By.id("username"));
		
		js.executeScript("arguments[0].setAttribute('value','jai')", userIdBox);
		
		Object o = js.executeScript("return arguments[0].getAttribute('value')",userIdBox);
		
		
		String s = (String)o;
		System.out.println(s);
		
		WebElement passBox = driver.findElement(By.id("password"));
		
		js.executeScript("arguments[0].setAttribute('value','jai@123')", passBox);
		
		Object  p= js.executeScript("return arguments[0].getAttribute('value')", passBox);
		
		String q = (String)p;
		System.out.println(q);
		
		
		WebElement loginBtn = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", loginBtn);
		
		
		
		
		
		
		
		
		
		
		
	}

}
