package org.web.automation.library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	public static void takeScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File f= screenshot.getScreenshotAs(OutputType.FILE);
		File fd= new File("./Screenshots/"+name+".png");
		FileUtils.copyFile(f, fd);
		
	}

}
