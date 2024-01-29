package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4_4 {
public static void main(String[] args){
	
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

			WebDriver print = new FirefoxDriver();

			print.manage().window().maximize();
			print.get("http://greenstech.in/selenium-course-content.html");
			
			WebElement adayarText = print.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
			String text1 = adayarText.getText();
			System.out.println(text1);
			
		

	}


}
