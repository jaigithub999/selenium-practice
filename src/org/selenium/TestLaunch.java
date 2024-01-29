package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLaunch {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		// 1.AmazonSearch
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.amazon.in/");
		
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		dr.manage().window().maximize();
	/*	WebElement amazonweb = dr.findElement(By.xpath("(//input[@type='text'])"));
		amazonweb.sendKeys("iphone");
		WebElement searchbutton = dr.findElement(By.xpath("(//input[@id='nav-search-submit-button'])"));
		searchbutton.click();
		dr.quit();

		// 2.facebook
		WebDriver fb = new ChromeDriver();
		fb.get("https://www.facebook.com/");
		fb.manage().window().maximize();
		WebElement fbuser = fb.findElement(By.xpath("(//input[@type='text'])"));
		fbuser.sendKeys("jai@1");
		WebElement fbuserpass = fb.findElement(By.xpath("(//input[@type='password'])"));
		fbuserpass.sendKeys("123456");
		WebElement fblogin = fbuserpass.findElement(By.xpath("(//button[@value='1'])"));
		fblogin.click();
		fb.quit();

		// 3.automationtesting

		WebDriver demoauto = new ChromeDriver();
		demoauto.get("http://demo.automationtesting.in/Register.html");

		demoauto.manage().window().maximize();

		WebElement findElement = demoauto.findElement(By.xpath("(//input[@type='text'])[1]"));
		findElement.sendKeys("jayaselvam");

		WebElement findElement2 = demoauto.findElement(By.xpath("(//input[@type='text'])[2]"));
		findElement2.sendKeys("joseph");

		WebElement automationadd = demoauto.findElement(By.xpath("(//textarea[@rows='3'])"));
		automationadd.sendKeys("permbakkam,chennai");

		WebElement automationemail = demoauto.findElement(By.xpath("(//input[@type='email'])"));

		automationemail.sendKeys("j@123");

		WebElement automationno = demoauto.findElement(By.xpath("(//input[@type='tel'])"));
		automationno.sendKeys("8883397633");

		WebElement malebutton = demoauto.findElement(By.xpath("(//input[@type='radio'])[1]"));

		malebutton.click();

		WebElement moivebutton = demoauto.findElement(By.xpath("(//input[@type='checkbox']) [2]"));
		moivebutton.click();

		WebElement automationpass = demoauto.findElement(By.xpath("(//input[@id='firstpassword'])"));
		automationpass.sendKeys("123455678");

		WebElement retypepass = demoauto.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		retypepass.sendKeys("123455678");

		WebElement autologinbutton = demoauto.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		autologinbutton.click();

		demoauto.quit();


	

		// 7.cleartrip

		WebDriver cleartrain = new ChromeDriver();
		cleartrain.get("https://www.cleartrip.com/trains");

		WebElement trainfrom = cleartrain.findElement(By.xpath("(//input[@type='text']) [1]"));
		trainfrom.sendKeys("Chennai");

		WebElement trainto = cleartrain.findElement(By.xpath("(//input[@type='text']) [2]"));
		trainto.sendKeys("Deli");

		WebElement trainbutton = cleartrain.findElement(By.xpath("(//button[@id='trainFormButton'])"));
		trainbutton.click();

		cleartrain.quit();

		// 8.greens_model_resume

		

		

		// 9.flipkart

		WebDriver flipkart = new ChromeDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		WebElement fliplogin = flipkart.findElement(By.xpath("(//input[@autocomplete='off']) [2]"));
		fliplogin.sendKeys("jai.selvam@gmail.com");

		WebElement loginbutton = flipkart.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3AWRsL'])"));

		loginbutton.click();

		flipkart.quit();

		// 10.AmazonSearch

		WebDriver amazonanyproduct = new ChromeDriver();
		amazonanyproduct.get("https://www.amazon.in/");

		amazonanyproduct.manage().window().maximize();

		WebElement amazongold = amazonanyproduct.findElement(By.xpath("(//input[@type='text'])"));
		amazongold.sendKeys("gold");

		WebElement searchgold = amazonanyproduct.findElement(By.xpath("(//input[@id='nav-search-submit-button'])"));
		searchgold.click();
		amazonanyproduct.quit();

		// 13.myntra

		WebDriver myntra = new ChromeDriver();

		myntra.get("https://www.myntra.com/register?referer=https://www.myntra.com/");

		myntra.manage().window().maximize();

		WebElement myntralogin = myntra
				.findElement(By.xpath("//*[@id=\"reactPageContent\"]" + "/div/div/div[2]/div[2]/div[1]/input"));

		myntralogin.sendKeys("8760787112");

		WebElement myntralogbutton = myntra.findElement(By.xpath("(//div [@class='submitBottomOption'] )"));
		myntralogbutton.click();
		myntra.quit();
		// 14.swiggy
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

		swiggy.quit();

		// 6.Redbus
		WebDriver redbus = new ChromeDriver();

		redbus.get("https://www.redbus.in/");

		redbus.manage().window().maximize();
		WebElement signup = redbus.findElement(By.xpath("//*[@id=\"signin-block\"]"));
		signup.click();

		WebElement signup2 = redbus.findElement(By.xpath("//*[@id=\"signInLink\"]"));
		signup2.click();

		WebElement redbusphone2 = redbus.findElement(By.xpath("//*[@id=\"mobileNoInp\"]"));
		redbusphone2.click();
		redbusphone2.sendKeys("8883397634");

		redbus.close();

		// 11.googleacc_creation

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

		WebElement buttonclick2 = googleacc.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])"));
		buttonclick2.click();

		// 12.snapdeal

		WebDriver snapdeal = new ChromeDriver();

		snapdeal.get("https://www.snapdeal.com/");

		snapdeal.manage().window().maximize();

		WebElement flipkartsign = snapdeal.findElement(By.xpath("(//div[@class='accountInner'])"));

		flipkartsign.click();

		WebElement snaplogin = snapdeal.findElement(
				By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]" + "/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a"));

		snaplogin.click();

		WebElement mobilenumber = snapdeal.findElement(By.id("username"));
		mobilenumber.sendKeys("jayaselvam999@gmail.com");

		WebElement mobilenumberlogin = snapdeal.findElement(
				By.xpath("(//button[@class='btn col-xs-24 " + "btn-large btn-skyblue continueBtn marT20 marB30'])"));
		mobilenumberlogin.click();
*/
	}
}
