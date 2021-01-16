package TestExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkBoxres {
	WebDriver driver;
	public  void checkboxres(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (css="input:nth-child(1)")
		WebElement checkbox1;
	@FindBy (xpath="//input[2]")
		WebElement checkbox2;
	
	public WebElement checkbox1()
	{
		return checkbox1;
	}
	public WebElement checkbox2()
	{
		return checkbox2;
	}
}
