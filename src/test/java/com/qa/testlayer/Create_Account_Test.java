package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.SignUpPage;
import com.qa.testBase.TestBase;

public class Create_Account_Test extends TestBase
{
	@Test
	public void Create_AccountTest()
	{
		HomePage h1=new HomePage();
		SignUpPage s1=new SignUpPage();
		
		h1.Click_Register_account_LinkButton();
		
		s1.Select_Gender_Radio_button();
		s1.Enter_First_Name_TextBox();
		s1.Enter_Last_Name_TextBox();
		s1.Enter_Email_TextBox();
		s1.Enter_Password_TextBox();
		s1.Enter_Confirm_Password_TextBox();
		s1.Click_SignUp_Button();
		Assert.assertEquals("Your registration completed", s1.Check_SuccessfulAccountCreation());
	}

}
