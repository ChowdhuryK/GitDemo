package TestExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import resources.base;

public class dynamicContentTest extends base {
	
	@Test
	public void dynamiccontenttest() throws IOException, InterruptedException
	{
		driver=initalizeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homePageRes hp=new homePageRes(driver);
		hp.dynamiccontent.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]")).getText());
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[2]")).getText());	
	}
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
		
	}
}
