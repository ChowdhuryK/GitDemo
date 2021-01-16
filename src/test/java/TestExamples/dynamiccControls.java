package TestExamples;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.base;

public class dynamiccControls extends base{

	@Test
	public void dynamicontrol() throws IOException, InterruptedException{
		
		driver=initalizeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homePageRes hp = new homePageRes (driver);
		hp.dynamiccontrol().click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.id("message")));
		
		
		
		
	}
	
}
