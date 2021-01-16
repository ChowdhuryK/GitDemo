package TestExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageRes {
		WebDriver driver;
		public  homePageRes(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="//h1[contains(text(),'Welcome to the-internet')]")
		WebElement homepageheader;
		@FindBy (xpath="//a[contains(text(),'Basic Auth')]")
		WebElement basicauth;
		
		@FindBy (xpath="//a[contains(text(),'Checkboxes')]")
		WebElement checkbox;
		
		@FindBy (xpath="//a[contains(text(),'Context Menu')]")
		WebElement contextmenu;
		
		@FindBy(css="[href*='drag']")
		WebElement draganddrop;
		
		@FindBy(xpath="//a[contains(text(),'Dropdown')]")
		WebElement dropdown;
		
		@FindBy(xpath="//a[contains(text(),'Dynamic Content')]")
		WebElement dynamiccontent;
		
		@FindBy(xpath="//a[contains(text(),'Dynamic Controls')]")
		WebElement dynamiccontrols;
		
		
		public WebElement homepageheader()
		{
			return homepageheader;
		}
		public WebElement basicauth()
		{
			return basicauth;
		}
		public checkBoxres checkboxs()
		{
			checkbox.click();
			checkBoxres cb=new checkBoxres();
			return cb;
		}
		public WebElement contextmenu() 
		{
			return contextmenu;
		}
		public draganddropRes draganddrop()
		{
			draganddrop.click();
			draganddropRes dd=new draganddropRes();
			return dd;
		}
		public WebElement dropdown()
		{
			return dropdown;
		}
		public WebElement dynamiccontent()
		{
			return dynamiccontent;
		}
		public WebElement dynamiccontrol()
		{
			return dynamiccontrols;
		}
	
		}

