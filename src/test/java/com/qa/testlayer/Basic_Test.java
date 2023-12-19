package com.qa.testlayer;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class Basic_Test extends TestBase
{
	HomePage h1=new HomePage();
	SoftAssert softAssertvar=new SoftAssert();
	
	@Test(priority = 2)
	public void Logo_Displayed_Test()
	{
		
		 assertTrue(h1.Check_Logo(),"Logo is not displayed");
	}
	
	@Test(priority = 3)
	public void Check_Title_Test()
	{
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
	}
	
	@Test (priority = 1)
	public void URL_Test()
	{
		logg.info("Fetch current URL");
		String actual_Url = driver.getCurrentUrl();
		logg.info("Fetched current URL");
		String expected_URL ="https://demowebshop.tricentis.com/";
		logg.info("Matching the acutal and expected URLs");
		softAssertvar.assertEquals(actual_Url, expected_URL);
		logg.info("URL match  pass");
		
	}

}
