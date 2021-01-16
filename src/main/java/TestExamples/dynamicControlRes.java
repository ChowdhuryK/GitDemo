
package TestExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicControlRes {
	
	WebDriver driver;
	public dynamicControlRes(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public  void dynamiccontrolRes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//input[@type='checkbox']")
		WebElement checkbox;
	@FindBy (xpath="//button[contains(text(),'Remove')]")
		WebElement addandremove;
	@FindBy(id="message")
		WebElement message;
	
	
	
	
	public WebElement checkbox()
	{
		return checkbox;
	}
	public WebElement addandremove()
	{
		return addandremove;
	}
	public WebElement message()
	{
		return message;
	}
	
}
	
	


