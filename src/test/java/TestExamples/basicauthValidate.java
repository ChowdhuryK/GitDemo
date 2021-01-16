package TestExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.base;

public class basicauthValidate extends base{
	
	
	@Test
	public void basicauthvalidation() throws IOException
	{
		driver=initalizeDriver();
		driver.get(prop.getProperty("https://admin:admin@the-internet.herokuapp.com/basic_auth"));
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		driver.close();
	}
	 

	}


