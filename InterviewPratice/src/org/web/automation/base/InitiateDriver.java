package org.web.automation.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.library.PropertyReader;

public class InitiateDriver {
	
	public  WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws IOException
	{
		if (PropertyReader.applicationConfigReader("Browser_name").equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Study Material\\SeleniumPractice\\src\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(PropertyReader.applicationConfigReader("Browser_name").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Study Material\\SeleniumPractice\\src\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Study Material\\SeleniumPractice\\src\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		
		
		driver.get(PropertyReader.applicationConfigReader("Application_URL"));
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void clsoeBrowser()
	{
	//driver.close();
	}

}
