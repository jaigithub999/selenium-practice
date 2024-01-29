package task.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {
	public static void main(String[] args) {
		System.setProperty("wedriver.edge.driver","C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	}
	
	
	

}
