package TestExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;

public class contextMenuTest extends base{
	
	@Test
	public void contextmenuclick() throws IOException, InterruptedException
	{
		
		driver=initalizeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		homePageRes hp=new homePageRes(driver);
		hp.contextmenu.click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("hot-spot"));
		actions.contextClick(elementLocator).perform();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
