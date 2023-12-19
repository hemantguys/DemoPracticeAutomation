package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.utilities.ReadConfigFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public ReadConfigFile configfile;
    public static final Logger logg= Logger.getLogger("Demo Shopping Testing Logs");
   // ReadConfigFile configfile=new ReadConfigFile(); 
    //object of class which read url and other values from config.properties file

	@BeforeClass
	public void start()
	{
		configfile= new ReadConfigFile();
		PropertyConfigurator.configure("log4j.properties");
		logg.info("Framework execcution started");
	}
	
	@AfterClass
	public void end()
	{
		
		logg.info("Framework execcution Finished");
	}

	@BeforeMethod 
	@Parameters("browser")
	public void setUp(String bro)
	{
		
		String Browser=bro;
		
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			logg.info("Chrome browser launched");
			driver= new ChromeDriver();
			
		}
		else if(Browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			logg.info("Firefox browser launched");
			driver= new FirefoxDriver();
			
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			logg.info("edge browser launched");
			driver= new EdgeDriver();
			
		}
		else 
		{
			System.out.println("Please selete valid Browser");
			logg.info("Check Browser name");
			
		}
		
		
		driver.get(configfile.getURL());  //read url from config.properties file via ReadConfigFile.jav
		logg.info("Application started");
		
		driver.manage().window().maximize();
		logg.info("Browser maximized");
		driver.manage().deleteAllCookies();
		logg.info("Cookies deleted");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logg.info("Implicitly wait given");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		logg.info("Page load wait given");
		
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logg.info("Browser closed");
	}
}
