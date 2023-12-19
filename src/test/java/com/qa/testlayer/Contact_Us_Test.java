package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.ContactUs;
import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class Contact_Us_Test extends TestBase
{
	
	@Test
    public void Contact_Us_Test11()
    {
		HomePage h1=new HomePage();
        ContactUs contact=new ContactUs();
		h1.Click_ContactUs_LInkbutton();
		contact.Enter_Name_textBox_ContactUsPage("Hanumat");
		contact.Enter_Email_textBox_ContactUsPage("kk12345@gmail.com");
		contact.Enter_enquiry_textBox_ContactUsPage("I have received wrong product please call me on 9815925959");
		contact.click_Enquiry_button_ContactUsPage();
		
		String Expected_text="Your enquiry has been successfully sent to the store owner.";
		String Actual_text = contact.Result_On_ContactUs_Page();
				
		Assert.assertEquals(Actual_text, Expected_text);		

    }

}
