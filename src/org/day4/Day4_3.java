package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Day4_3 {
public static void main(String[] args) throws InterruptedException{
	
			System.setProperty("webdriver.msedge.driver",
					"C:\\Users\\jayaselvamjai\\" + "eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

			WebDriver print = new EdgeDriver();

			print.manage().window().maximize();
			print.get("http://greenstech.in/selenium-course-content.html");
			
			WebElement selenium = print.findElement(By.xpath("//span[@title='Trainer']"));
			selenium.click();
			
			Thread.sleep(5000);
			
			WebElement selenium1 = print.findElement(By.xpath("(//p[contains(text(),'Velmurugan')])[2]"));
			String text = selenium1.getText();
			System.out.println(text);
	}


}
