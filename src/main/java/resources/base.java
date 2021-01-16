package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public WebDriver driver;
public Properties prop;
	

		public WebDriver initalizeDriver() throws IOException{
		
		prop=new Properties();	
		FileInputStream fis=new FileInputStream("C:\\Users\\karim\\eclipse-workspace\\HeroUApp\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsers=prop.getProperty("browser");
		
	
		if(browsers.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\karim\\Documents\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}}