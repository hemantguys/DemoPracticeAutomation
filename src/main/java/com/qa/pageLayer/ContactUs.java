package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ContactUs extends TestBase
{
	public ContactUs()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='FullName']")
	private WebElement Name_textBox;
	
	public void Enter_Name_textBox_ContactUsPage(String name)
	{
		Name_textBox.sendKeys(name);
	}
    
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement Email_TextBox;
	
	public void Enter_Email_textBox_ContactUsPage(String email)
	{
		Email_TextBox.sendKeys(email);
	}
   
	@FindBy(xpath = "//textarea[@id='Enquiry']")
	private WebElement Enquiry_textBox;
	
	public void Enter_enquiry_textBox_ContactUsPage(String enquiry)
	{
		Enquiry_textBox.sendKeys(enquiry);
	}
    
	@FindBy(xpath = "//input[@name='send-email']")
	private WebElement Submit_ContactUs_Button;
	
	public void click_Enquiry_button_ContactUsPage()
	{
		Submit_ContactUs_Button.click();
	}
	
	@FindBy(xpath = "//div[@class='result']")
	private WebElement Request_ContactUsPage;
	
	public String Result_On_ContactUs_Page()
	{
		return Request_ContactUsPage.getText();
	}
}
