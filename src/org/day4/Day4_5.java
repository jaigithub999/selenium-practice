package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_5 {
public static void main(String[] args) throws InterruptedException{
	
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

			WebDriver greensText = new FirefoxDriver();

			greensText.manage().window().maximize();
			
			greensText.get("http://www.greenstechnologys.com/");
			
			WebElement btnClose = greensText.findElement(By.xpath("//button[@type='button']"));
			
			Thread.sleep(2000);
			
			btnClose.click();
			
			WebElement adayarText = greensText.findElement(By.xpath("//p[@style='text-align:justify; font-size:18px;'][2]"));
			String text1 = adayarText.getText();
			System.out.println(text1);
			
		

	}


}
