package TestExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class draganddropRes {
	
	WebDriver driver;
	public  void draganddropres(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="column-a")
		WebElement boxa;
	@FindBy (id="column-b")
		WebElement boxb;
	
	public WebElement boxa()
	{
		return boxa;
	}
	public WebElement boxb()
	{
		return boxb;
	}
}



