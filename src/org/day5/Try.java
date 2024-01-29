package org.day5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");

		WebDriver greensTech = new ChromeDriver();

		greensTech.get("http://www.greenstechnologys.com/courses.html");

		greensTech.manage().window().maximize();

//	WebElement courseBtn = greensTech.findElement(By.xpath("//div[text()='Courses ']"));
//	Actions a = new Actions(greensTech);
//		a.moveToElement(courseBtn).perform();
//
//		WebElement dataWarehousingTxt = greensTech.findElement(By.xpath("// span[text()='Data Warehousing (5)']"));
//
//		a.moveToElement(dataWarehousingTxt).perform();
//		
//		Thread.sleep(1000);
//		
//		WebElement viewAllCourseTxt = greensTech.findElement(By.xpath("(//a[text()='View All Courses'])[8]"));
//		viewAllCourseTxt.click();//*
//		
//		Thread.sleep(3000);
//		
//		WebElement adCloseBtn = greensTech.findElement(By.xpath("//button[@class='close' and @type='button']"));
//		
//		adCloseBtn.click();
//		
//		Thread.sleep(4000);
//		WebElement couresTxt = greensTech.findElement(By.xpath("(//a[text()='Courses '])[1]"));
//		a.moveToElement(couresTxt).perform();
//	
//		Thread.sleep(2000);
//		
//		WebElement dataWareHousingTraining = greensTech.findElement(By.xpath("(//a[text()='Data Warehousing Training '])[1]"));
//		a.moveToElement(dataWareHousingTraining).perform();
		
//		WebElement mocrostrategyTraining = greensTech.findElement(By.xpath("//span[text()='Microstrategy Training']"));
//		a.moveToElement(mocrostrategyTraining).perform();
//		
		

		
	}
}