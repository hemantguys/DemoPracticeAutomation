package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class ScreenShotClass extends TestBase
{
	static String path= "C:\\Users\\HP\\eclipse-workspaceSept7Javasele\\October22DemoRecordFramework1\\archetype-fitgoodies-quickstart\\Screenshots\\";
	public static void ScreenshotMethod(String name) throws IOException
	{
		try {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des= new File(path + name + ".png");
			FileHandler.copy(src, des);
			
		} catch (Exception e) {
System.out.println("Exception is here");		}
		
	}

}
