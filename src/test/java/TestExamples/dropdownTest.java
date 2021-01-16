package TestExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;

public class dropdownTest extends base {
	
	@Test
	public void dropdown() throws IOException, InterruptedException
	{
		driver=initalizeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		homePageRes hp=new homePageRes(driver);
		hp.dropdown.click();
		Thread.sleep(2000);
		WebElement ddown=driver.findElement(By.id("dropdown"));
		Select s=new Select(ddown);
		s.selectByValue("2");
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	}


