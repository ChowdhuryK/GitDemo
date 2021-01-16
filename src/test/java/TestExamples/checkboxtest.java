package TestExamples;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;

public class checkboxtest extends base{

	
@Test
public void checkbox() throws IOException, InterruptedException
{
	driver=initalizeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	Thread.sleep(2000);
	homePageRes hp=new homePageRes(driver);
	checkBoxres cb=hp.checkboxs();
	Thread.sleep(2000);
	cb.checkbox1.click();
	cb.checkbox2.click();
}

@AfterTest
public void teardown()
{
	driver.quit();
}
}


