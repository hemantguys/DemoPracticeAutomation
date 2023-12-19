//package com.qa.testlayer;
//
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.qa.utilities.DataProviderClass;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DataproviderTesting
//{
//	@Test()
//  public void test1(String un, String pass)
//  {
//	  WebDriver driver= new ChromeDriver();
//	  WebDriverManager.chromedriver().setup();
//	  driver.get("https://demowebshop.tricentis.com/");		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		
//		
//		driver.quit();
//  }
//	
////	@DataProvider(name="DataProvidername")
////	public String[][] fatchLoginData() throws EncryptedDocumentException, IOException
//	//{
//	//	DataProviderClass dpc=new DataProviderClass();
////		//int totalrow= dpc.rowcount(0);
////		int totalcol = dpc.colcount(0, totalrow);
////		String data[][]=new String[totalrow][totalcol];
////		for (int i =1; i<=totalrow; i++)
////		{
////			for(int j=0; j< totalcol; j++)
////			{
////				data[i-1][j]= dpc.readData(0, i, j);
////			}
////		}
////		
////		return data;
//		
//	}
//
//}
