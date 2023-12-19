package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SignUpPage extends TestBase
{
	int Timestamp= (int) System.currentTimeMillis();
    public SignUpPage()
    {
    	PageFactory.initElements(driver, this);
    	
    }
    // Gender Radio button
    @FindBy(xpath ="//input[@id='gender-male']")
    private WebElement Gender_Radio_Button;
    
    public void Select_Gender_Radio_button()
    {
    	Gender_Radio_Button.click();
    }
    
    
    @FindBy(xpath ="//input[@id='FirstName']")
    private WebElement First_Name_TextBox;
    
    public void Enter_First_Name_TextBox()
    {
    	First_Name_TextBox.sendKeys("Hemant"+Timestamp);
    }
    
    
    @FindBy(xpath ="//input[@id='LastName']")
    private WebElement Last_Name_TextBox;
    
    public void Enter_Last_Name_TextBox()
    {
    	Last_Name_TextBox.sendKeys("Kumar"+Timestamp);
    }
    
    
    @FindBy(xpath ="//input[@id='Email']")
    private WebElement Email_TextBox;
    
    public void Enter_Email_TextBox()
    {
    	Email_TextBox.sendKeys("Hkumar"+ Timestamp+ "@gmail.com");
    }
    
    @FindBy(xpath ="//input[@id='Password']")
    private WebElement Password_TextBox;
    
    public void Enter_Password_TextBox()
    {
    	Password_TextBox.sendKeys("Hk"+Timestamp);
    }
    
    
    
    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    private WebElement Confirm_Password_TextBox;
    
    public void Enter_Confirm_Password_TextBox()
    {
    	Confirm_Password_TextBox.sendKeys("Hk"+Timestamp);
    }
    
    @FindBy(xpath ="//input[@id='register-button']")
    private WebElement SignUpButton;
    
    public void Click_SignUp_Button()
    {
    	SignUpButton.click();
    }
    
    
    
  
    
    
    
    @FindBy(xpath ="//div[@class='result']")
    private WebElement SuccessfulAccountCreation;
    
    public String Check_SuccessfulAccountCreation()
    {
    	String Actual_Result=SuccessfulAccountCreation.getText();
    	return Actual_Result;
    }
    
    
    
    
}
