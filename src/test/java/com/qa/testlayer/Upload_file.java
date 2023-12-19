package com.qa.testlayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file 
{
	@Test
	public void UploadFiles() throws InterruptedException, IOException
	{
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.remove.bg/upload");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
		
		Thread.sleep(1000);
		
	   Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\abcd.Exe");
	   
	   
		
	}

}


//
//ControlFocus("Open","","Edit1")
//ControlSetText("Open","","Edit1","C:\Users\HP\Desktop\dandelion-445228_640.jpg")
//ControlClick("Open","","Button1")
