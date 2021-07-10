package org.web.automation.testcases;
import java.io.IOException;
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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.web.automation.base.InitiateDriver;
import org.web.automation.library.CaptureScreenshot;
import org.web.automation.library.PropertyReader;

public class TC006_LoginAndVerifyMe extends InitiateDriver {
	
		
		
		@Test
		public void tc001() throws IOException
		{
			driver.findElement(By.xpath(PropertyReader.applicationLocaterReaders("login_page_tab_xpath"))).click();
			//driver.findElement(By.xpath("//label[text()='Login']//parent::li")).click();
			driver.findElement(By.xpath("//input[@name='_txtUserName']")).sendKeys(PropertyReader.applicationConfigReader("Application_Usernam"));
			driver.findElement(By.xpath("//input[@name='_txtPassword']")).sendKeys("test");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			driver.getWindowHandle();
			
			CaptureScreenshot.takeScreenshot(driver,"AfterLogin");
			//Assert.assertTrue(result, "");
			
			//driver.findElement(By.xpath("//button[text()='View Me']")).click();
			
			//WebDriverWait wait = new WebDriverWait(driver,20);
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='modal-content']"))));
			
			//driver.findElement(By.xpath("//a[text()='Download']")).click();
			
			
//			driver.findElement(By.xpath("//input[@name='fld_username']")).sendKeys("Hello");
//			driver.findElement(By.xpath("//input[@name='fld_email']")).sendKeys("Hello@yahoo.com");
//			//driver.findElement(By.xpath("//a[text()='Read Detail']")).click();
//			//driver.findElement(By.xpath("//input[@value='Sign up']")).click();
//			driver.findElement(By.xpath("//input[@value='home']")).click();
//			driver.findElement(By.xpath("//input[@name='terms']")).click();
//			
//			Select country = new Select (driver.findElement(By.xpath("//select[@id='countryId']")));
//			//country.selectByIndex(10);
//			country.selectByVisibleText("India");
//			System.out.println(country.getFirstSelectedOption());
			
//			List<WebElement>countries= country.getOptions();
//			
//			for (WebElement e:countries )
//			{
//				System.out.println(e.getText());
//			}
//			
//			Select state = new Select (driver.findElement(By.xpath("//select[@id='stateId']")));
//			state.selectByVisibleText("Delhi");
//			
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//select[@id='stateId']")), "Delhi"));
//			
//			Select city = new Select (driver.findElement(By.xpath("//select[@id='cityId']")));
//			city.selectByVisibleText("Delhi");
//			
//			System.out.println("Url of current page URl is : "+driver.getCurrentUrl());
//			System.out.println(driver.getTitle());
//			System.out.println(driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled());
		
		}
		
		
		
		
		
		

	}



