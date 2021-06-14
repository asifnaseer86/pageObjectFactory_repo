package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifLoginPageObjectFatory {
	
	WebDriver driver;
	public ReddifLoginPageObjectFatory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By username = By.xpath("//input[@id='login1']");
//	By password = By.name("passwd");
//	By go = By.name("proceed");
//	By home = By.className("f12");
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(className="f12")
	WebElement home;
	
	public WebElement EmailID() 
	{
		return username;
	}
	
	public WebElement Password() 
	{
		return password;
	}
	
	public WebElement Submit() 
	{
		return go;
	}
	
	public WebElement Home() 
	{
		return home;
	}
}
