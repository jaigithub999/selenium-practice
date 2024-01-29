
	package org.selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Day3_1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\chromedriver.exe");
			//8.Greens
			WebDriver greens2 = new ChromeDriver();
			greens2.get("http://greenstech.in/selenium-course-content.html");

			greens2.manage().window().maximize();

			WebElement modelresume = greens2.findElement(By.xpath("(//h2[@class='mb-0']) [2]"));
			modelresume.click();

			WebElement modelresume1 = greens2.findElement(By.xpath("(//a[@title='Model Resume training in chennai']) [1]"));
			modelresume1.click();	
			// 4.greenstech

			WebDriver greens = new ChromeDriver();
			greens.get("http://greenstech.in/selenium-course-content.html");

			greens.manage().window().maximize();

			WebElement interviewbutton = greens.findElement(By.xpath("//div[@id='heading20']"));
			interviewbutton.click();
			
			Thread.sleep(3000);
			WebElement ctsinterview  = greens.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
			
			ctsinterview.click();
			
			

		
			//11. Google Account
			WebDriver googleacc = new ChromeDriver();

			googleacc.get("https://accounts.google.com/signup/v2/"
					+ "webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

			WebElement firstname = googleacc.findElement(By.xpath("(//input[@type='text'])"));
			firstname.sendKeys("jai");

			WebElement secoundname = googleacc.findElement(By.xpath("(//input[@type='text']) [2]"));
			secoundname.sendKeys("jack");

			WebElement gmail = googleacc.findElement(By.xpath("(//input[@type='email'])"));
			gmail.sendKeys("jaiselvamjackjava123");

			WebElement password = googleacc.findElement(By.xpath("(//input[@type='password'])"));
			password.sendKeys("2390473jkl");

			WebElement password2 = googleacc.findElement(By.xpath("(//input[@type='password']) [2]"));
			password2.sendKeys("2390473jkl");

			WebElement buttonclick = googleacc.findElement(By.xpath("(//input[@class='VfPpkd-muHVFf-bMcfAe'])"));
			buttonclick.click();

			WebElement buttonclick2 = googleacc.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
			buttonclick2.click();
			
			
//		12. Swiggy
		
		
			WebDriver swiggy = new ChromeDriver();

			swiggy.get("https://www.swiggy.com/");

			swiggy.manage().window().maximize();

			WebElement swiggysignup = swiggy.findElement(By.xpath("(//a[@class='r2iyh'])"));

			swiggysignup.click();

			WebElement swiggyphone = swiggy.findElement(By.xpath("(//input[@class='_381fS'])"));
			swiggyphone.sendKeys("8883396633");

			WebElement swiggyname = swiggy.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
			swiggyname.sendKeys("selvam");

			WebElement swiggyemail = swiggy.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
			swiggyemail.sendKeys("jayaselvam999@gmail.com");

			WebElement swiggycontinue = swiggy.findElement(By.xpath("(//a[@class='a-ayg'])"));
			swiggycontinue.click();
}
}