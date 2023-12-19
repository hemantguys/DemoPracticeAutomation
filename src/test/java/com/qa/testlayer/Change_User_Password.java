package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.My_Account_Details_Pge;
import com.qa.pageLayer.Customer_information;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfigFile;

public class Change_User_Password extends TestBase
{
 @Test()
 public void Change_Pasword_Test()
 {
	 ReadConfigFile r1= new ReadConfigFile();  // Object of clas which read data from configuraiton file
	 HomePage h1=new HomePage();
	 LoginPage l1= new LoginPage();
	 Customer_information cust=new Customer_information();
	 My_Account_Details_Pge pass= new My_Account_Details_Pge();
	 
	 h1.Click_Login_LingButton();
	l1.Enter_UserName_textBox(r1.get_username());    // read user name from config.properties file
	l1.Enter_Password_textBox(r1.get_password());
	l1.Click_Login_Button();
	 
	 h1.Click_Cutomer_ID_link_button();
	 
	 cust.Click_change_Password_Link_Button();
	 
	 pass.Enter_Old_Password_TestBox("Hk9815925959");
	 pass.Enter_New_Password_TestBox("Hk9815925959");
	 pass.Enter_Confirm_New_Password_TestBox("Hk9815925959");
	 pass.Click_Change_Password_Button();
	 
	 Assert.assertEquals(pass.Get_Change_Password_Message_Label(),"Password was changed");
 }
}
