package com.qa.testlayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploaddata
{
	@Test
	 public void upload() throws InterruptedException
	 {
		 WebDriver driver= new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.remove.bg/upload");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement ele= driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']"));
			ele.click();
			
			Thread.sleep(2000);
			
			try {
				Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\abcd\\uploadd.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	 }

}
