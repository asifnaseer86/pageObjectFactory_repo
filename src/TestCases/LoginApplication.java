package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.ReddifHomePage;
import objectRepository.ReddifHomePageObjectFatory;
import objectRepository.ReddifLoginPage;

public class LoginApplication {
//Login page calss implemented  in normal page object pattern style
//Home page class implemented in page object factory methods
	
	@Test
	public void Login() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Cyborg Tech\\Automation Testing Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		ReddifLoginPage reddif = new ReddifLoginPage(driver);
		
		reddif.EmailID().sendKeys("emailAddress");
		reddif.Password().sendKeys("Password");
		reddif.Submit().click();
		reddif.Home().click();
		
		ReddifHomePageObjectFatory redifHome = new ReddifHomePageObjectFatory(driver);
		redifHome.Search().sendKeys("Test");
		redifHome.Submit().click();
	}
}
