package org.selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Day3_2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
			
			
			WebDriver flipkart = new ChromeDriver();

			flipkart.get("https://www.flipkart.com/");

			flipkart.manage().window().maximize();

			WebElement fliplogin = flipkart.findElement(By.xpath("(//input[@autocomplete='off']) [2]"));
			fliplogin.sendKeys("jai.selvam@gmail.com");

//			WebElement loginbutton = flipkart.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])"));
			
		
		}
		}