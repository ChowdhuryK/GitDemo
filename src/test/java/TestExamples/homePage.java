package TestExamples;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class homePage extends base {

	
	
	
	@Test
	public void homepages() throws IOException
	{
		driver=initalizeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		homePageRes hp=new homePageRes(driver);
		hp.homepageheader.getText();
	}
	
	

}
