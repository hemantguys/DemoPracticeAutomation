package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement UserNameTextBox;
	
	public void Enter_UserName_textBox(String un)
	{
		UserNameTextBox.sendKeys(un);
	}

	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement PasswordTextBox;
	
	public void Enter_Password_textBox(String pass)
	{
		PasswordTextBox.sendKeys(pass);
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;
	
	
	public void Click_Login_Button()
	{
		LoginButton.click();;
	}

	
	
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement Logout_Link_Button;
	
	public String Check_Successfully_login()
	{
		String Actual_Result=Logout_Link_Button.getText();
		return Actual_Result;
	}
	
	public void Click_logout_Button()
	{
		Logout_Link_Button.click();
	}
	
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement Login_Link_Button;
	
	public String Check_Successfully_logout()
	{
		String Actual_Result=Login_Link_Button.getText();
		return Actual_Result;
	}
}
