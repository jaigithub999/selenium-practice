package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q8 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver greensTech = new FirefoxDriver();

		greensTech.get("http://greenstech.in/selenium-course-content.html");

		greensTech.manage().window().maximize();

		WebElement courseBtn = greensTech.findElement(By.xpath("//div[text()='Courses ']"));

		Actions a = new Actions(greensTech);

		a.moveToElement(courseBtn).perform();

		WebElement dataWarehousingTxt = greensTech.findElement(By.xpath("// span[text()='Data Warehousing (5)']"));

		a.moveToElement(dataWarehousingTxt).perform();
		
		
		
		WebElement viewAllCourseTxt = greensTech.findElement(By.xpath("(//a[text()='View All Courses'])[8]"));
		viewAllCourseTxt.click();
		
		Thread.sleep(5000);
		
		WebElement adCloseBtn = greensTech.findElement(By.xpath("//button[@class='close']"));
		
		adCloseBtn.click();
		
		WebElement couresTxt = greensTech.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		a.moveToElement(couresTxt);
	
		WebElement dataWareHousingTraining = greensTech.findElement(By.xpath("(//a[text()='Data Warehousing Training '])[1]"));
		a.moveToElement(dataWareHousingTraining);
		
		WebElement mocrostrategyTraining = greensTech.findElement(By.xpath("//span[text()='Microstrategy Training']"));
		a.moveToElement(mocrostrategyTraining);
		
		

		
	}
}