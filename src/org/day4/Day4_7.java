package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Day4_7 {
public static void main(String[] args){
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jayaselvamjai\\" + "eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

			WebDriver print = new FirefoxDriver();

			print.manage().window().maximize();
			print.get("http://www.google.com/");
			
			WebElement searchBar = print.findElement(By.xpath("//input[@class='gLFyf']"));
			searchBar.sendKeys("greens velmurugan");
			
			WebElement searchBtn = print.findElement(By.xpath("(//input[@role='button'])[2]"));
			searchBtn.click();
			
			
			WebElement clickBtn = print.findElement(By.xpath("	(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
			clickBtn.click();
		

	}


}
