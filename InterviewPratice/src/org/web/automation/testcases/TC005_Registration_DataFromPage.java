package org.web.automation.testcases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC005_Registration_DataFromPage {
	
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
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
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
			//country.selectByIndex(10);
			country.selectByVisibleText("India");
			System.out.println(country.getFirstSelectedOption());
			
//			List<WebElement>countries= country.getOptions();
//			
//			for (WebElement e:countries )
//			{
//				System.out.println(e.getText());
//			}
			
			Select state = new Select (driver.findElement(By.xpath("//select[@id='stateId']")));
			state.selectByVisibleText("Delhi");
			
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//select[@id='stateId']")), "Delhi"));
			
			Select city = new Select (driver.findElement(By.xpath("//select[@id='cityId']")));
			city.selectByVisibleText("Delhi");
			
			System.out.println("Url of current page URl is : "+driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled());
		}
		
		@AfterMethod
		public void clsoeBrowser()
		{
		//driver.close();
		}
		

	}



