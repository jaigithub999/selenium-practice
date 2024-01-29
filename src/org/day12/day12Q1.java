package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day12Q1 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.edge.driver","C:\\Users\\jayaselvamjai\\eclipse-workspace"
				+ "\\SeleniumClass\\Drivers\\msedgedriver.exe" );
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		WebElement addBtn = driver.findElement(By.xpath("//button[@type='button']"));
		
		Thread.sleep(2000);
		
		addBtn.click();
		
		
		WebElement greensTxt = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",greensTxt);
		
		WebElement greensTxt2 = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		
		String text = greensTxt2.getText();
		
		System.out.println(text);
		
		
	}

}
