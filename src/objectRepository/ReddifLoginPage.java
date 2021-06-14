package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLoginPage {
	
	WebDriver driver;
	public ReddifLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@id='login1']");
	By password = By.name("passwd");
	By go = By.name("proceed");
	By home = By.className("f12");
	
	public WebElement EmailID() 
	{
		return driver.findElement(username);
	}
	
	public WebElement Password() 
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit() 
	{
		return driver.findElement(go);
	}
	
	public WebElement Home() 
	{
		return driver.findElement(home);
	}
}
