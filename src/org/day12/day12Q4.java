package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day12Q4 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.edge.driver","C:\\Users\\jayaselvamjai\\eclipse-workspace"
				+ "\\SeleniumClass\\Drivers\\msedgedriver.exe" );
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		WebElement emailBox = driver.findElement(By.id("email"));
		
		
		js.executeScript("arguments[0].setAttribute('value', 'jai')", emailBox);
		
		Object o = js.executeScript(" return arguments[0].getAttribute('value')", emailBox);
		
		String x = (String)o;

		System.out.println(x);
		
		WebElement passBox = driver.findElement(By.id("pass"));
		
		js.executeScript("arguments[0].setAttribute('value','jai@123')", passBox );
		
		Object k = js.executeScript(" return arguments[0].getAttribute('value')", passBox);
		
		String j = (String)k;

		System.out.println(j);
		
		WebElement logBtn = driver.findElement(By.name("login"));
		
		
		js.executeScript("arguments[0].click()", logBtn);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
