package org.web.automation.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004_Registration_DropDownList {
	
		WebDriver driver;
		
		@BeforeMethod
		public void startBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Study Material\\SeleniumPractice\\src\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.thetestingworld.com/testings/");
//			driver.navigate().back();
//			driver.navigate().forward();
			driver.manage().window().maximize();
			
		}
		
		@Test
		public void tc001()
		{
			driver.findElement(By.xpath("//input[@name='fld_username']")).sendKeys("Hello");
			driver.findElement(By.xpath("//input[@name='fld_email']")).sendKeys("Hello@yahoo.com");
			//driver.findElement(By.xpath("//a[text()='Read Detail']")).click();
			//driver.findElement(By.xpath("//input[@value='Sign up']")).click();
			driver.findElement(By.xpath("//input[@value='home']")).click();
			driver.findElement(By.xpath("//input[@name='terms']")).click();
			
			Select country = new Select (driver.findElement(By.xpath("//select[@id='countryId']")));
			country.selectByIndex(10);
		}
		
		@AfterMethod
		public void clsoeBrowser()
		{
		//driver.close();
		}
		

	}



