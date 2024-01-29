package org.alertmsg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day8Q5 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver bankcanara = new EdgeDriver();

		bankcanara.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

		bankcanara.manage().window().maximize();



		WebElement jsClick = bankcanara.findElement(By.xpath("//a[text()='https://online.canarabank.in ']"));
				
		JavascriptExecutor js =(JavascriptExecutor)bankcanara; 
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click()",jsClick);

		Thread.sleep(2000);

		WebElement loginBtn = bankcanara.findElement(By.id("ui-id-14"));

		loginBtn.click();

	
	}
}
