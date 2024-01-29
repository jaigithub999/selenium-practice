package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
//insta
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");
		WebDriver driver10 = new ChromeDriver();
		
		driver10.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		driver10.manage().window().maximize();
		
		WebElement instauser = driver10.findElement(By.xpath("//*[@id=\"/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[1]/div/label/input"));
		instauser.sendKeys("jayaselvam@");
		
		WebElement instapass = driver10.findElement(By.xpath("(//input[@type='password'])"));
		System.out.println(instapass);
		instauser.sendKeys("893496509");
		
		
		System.out.println("₹");
	}

}
