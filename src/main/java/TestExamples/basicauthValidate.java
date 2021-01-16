package TestExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basicauthValidate {

	WebDriver driver;
	public basicauthValidate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='login-btn']")
			WebElement loginbutton;
	
	@FindBy (xpath="//input[@id='user_email']")
			WebElement username;
	@FindBy (css="#user_password")
			WebElement password;

	public WebElement loginbutton()
	{
		return loginbutton;
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	
}	
				


