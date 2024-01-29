package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeBrowser {
	 public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");
		 
		 WebDriver driver1 = new InternetExplorerDriver();
		 driver1.get("http://www.greenstechnologys.com/");
		 
		 WebDriver driver2 = new InternetExplorerDriver();
		 driver2.get("http://demo.automationtesting.in/Register.html");
		 
		 WebDriver driver3 = new InternetExplorerDriver();
		 driver3.get("http://www.greenstechnologys.com/");
		 
		 WebDriver drivr4 = new InternetExplorerDriver();
		 drivr4.get("http://greenstech.in/selenium-course-content.html");
		 
		 
	}

}
