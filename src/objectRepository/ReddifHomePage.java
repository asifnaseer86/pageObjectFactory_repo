package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifHomePage {
	
	WebDriver driver;
	public ReddifHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.cssSelector("#srchword");
	By submit = By.cssSelector("input[value=' ']");
	
	public WebElement Search() 
	{
		return driver.findElement(search);
	}
	
	public WebElement Submit() 
	{
		return driver.findElement(submit);
	}
}
