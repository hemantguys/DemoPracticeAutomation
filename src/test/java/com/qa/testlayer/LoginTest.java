package com.qa.testlayer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;
import com.qa.utilities.DataProviderClass;
import com.qa.utilities.ReadConfigFile;

import junit.framework.Assert;

public class LoginTest extends TestBase
{
	@Test(priority = 1)
	public void LoginTestcase()
  	{
		ReadConfigFile r1= new ReadConfigFile();  // Object of clas which read data from configuraiton file
		HomePage h1=new HomePage();
		LoginPage l1= new LoginPage();
		
		System.out.println("Added on Git hub");
			System.out.println("Hemant");
		h1.Click_Login_LingButton();
		logg.info("Clicked Login button");
		l1.Enter_UserName_textBox(r1.get_username());    // read user name from config.properties file
		logg.info("User name Entered");
		l1.Enter_Password_textBox(r1.get_password());
		logg.info("Password entered");
		l1.Click_Login_Button();
		logg.info("Login button Clicked");
		String Expected_Result="Log out";
		
		Assert.assertEquals(Expected_Result, l1.Check_Successfully_login());
		logg.info("Login successful");
		System.out.println("EHantlksdjfsdf");
	}
	
	@Test (priority = 2)
	public void Login_Logout_test() throws InterruptedException
	{
		ReadConfigFile r1= new ReadConfigFile();  // Object of clas which read data from configuraiton file
		HomePage h1=new HomePage();
		LoginPage l1 = new LoginPage();
		
		h1.Click_Login_LingButton();
		logg.info("Clicked Login button");
		l1.Enter_UserName_textBox(r1.get_username());    // read user name from config.properties file
		logg.info("User name Entered");
		l1.Enter_Password_textBox(r1.get_password());
		logg.info("Password entered");
		l1.Click_Login_Button();
		logg.info("Login button Clicked");
		String Expected_Result="Log out";
		Assert.assertEquals(Expected_Result, l1.Check_Successfully_login());
		logg.info("Login successful");
		
		l1.Click_logout_Button();
		logg.info("Logout Button CLicked");
		Thread.sleep(2000);
		String Expected_Result_Logout="Log in";
		Assert.assertEquals(Expected_Result_Logout, l1.Check_Successfully_logout());
		
		logg.info("Logout successfull");
		
		
	}
	
	
//	@Test(dataProvider = "UsernamePasswords")
//	public void LoginTestcase(String Username, String Password)
//  	{
//		HomePage h1=new HomePage();
//		LoginPage l1= new LoginPage();
//		h1.Click_Login_LingButton();
//		l1.Enter_UserName_textBox(Username);
//		l1.Enter_Password_textBox(Password);
//		l1.Click_Login_Button();
//		String Expected_Result="Log out";
//		Assert.assertEquals(Expected_Result, l1.Check_Successfully_login());
//	}
//	
//	
//	
//	@DataProvider(name =  "UsernamePasswords")
//	public String[][] DataProvidermethod() throws EncryptedDocumentException, IOException
//	{
//		DataProviderClass DPC= new DataProviderClass();
//		int total_rows= DPC.rowCount(0);
//		int total_Col= DPC.colCount(0, total_rows);
//		String data[][]=new String[total_rows][total_Col];
//		
//		for (int i= 1; i<=total_rows; i++)
//		{
//			for (int j=0; j<total_Col; j++)
//			{
//				data[i-1][j]=DPC.readData(0, i, j);
//			}
//		}
//	
//		return data;
//	}



}


