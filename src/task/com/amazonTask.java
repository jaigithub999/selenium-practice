package task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\" + "SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver demoAmazon = new EdgeDriver();

		demoAmazon.get("https://www.amazon.in/");

		demoAmazon.manage().window().maximize();

	
		WebElement searchBox = demoAmazon.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("iphone");	
		
		WebElement searchBoxBtn= demoAmazon.findElement(By.xpath("//input[@type='submit']"));
		searchBoxBtn.click();

		List<WebElement> iphoneList = demoAmazon.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		System.out.println("Number of Iphone:  "+iphoneList.size());
		
		/*for (int i = 0; i < args.length; i++) {
			 iphoneList = i;
			System.out.println(""+WebElement.get);
			
			
		}*/
		
		for (WebElement webElement : iphoneList) {
		
		System.out.println("iphoneLIst:"+webElement.getText());
		
	}
}
}