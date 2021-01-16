package TestExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;

public class draganddropTest extends base {
	
	@Test
	public void draganddrop() throws IOException, InterruptedException
	{
		driver=initalizeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		homePageRes hp=new homePageRes(driver);
		hp.draganddrop();
		WebElement src= driver.findElement(By.id("column-a"));
		WebElement des= driver.findElement(By.id("column-b"));
		
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
