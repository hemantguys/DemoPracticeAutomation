package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Customer_information extends TestBase
{
	public Customer_information()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//customer information link button
	@FindBy (xpath = "//a[text()='Customer info']")
	private WebElement CustomerInfo_Link_Button;
	
	public void Click_CustomerInfo_Link_Button()
	{
		CustomerInfo_Link_Button.click();
	}

	
	//customer Address link button
	
	@FindBy (xpath = "(//a[text()='Addresses'])[1]")
	private WebElement Customer_Address_Link_Button;
	
	public void Click_Customer_Address_Link_Button()
	{
		Customer_Address_Link_Button.click();
	}

	//customer Orders link button
	
	@FindBy (xpath = "(//a[text()='Orders'])[1]")
	private WebElement Orders_Link_Button;
	
	public void Click_Orders_Link_Button()
	{
		Orders_Link_Button.click();
	}
	
	
	//customer Downloadable products link button
	@FindBy (xpath = "//a[text()='Downloadable products']")
	private WebElement Downloadable_Product_Link_Button;
	
	public void Click_Downloadable_Product_Link_Button()
	{
		Downloadable_Product_Link_Button.click();
	}

	
	
	

	
	
	//customer Back in stock subscriptions link button
	@FindBy (xpath = "//a[text()='Back in stock subscriptions']")
	private WebElement Back_in_Stock_subscriptions_Link_Button;
	
	public void Click_Back_in_Stock_subscriptions_Link_Button()
	{
		Back_in_Stock_subscriptions_Link_Button.click();
	}

	
	
	//customer Reward point link button

	@FindBy (xpath = "//a[text()='Reward points']")
	private WebElement Reward_points_Link_Button;
	
	public void Click_Reward_points_Link_Button()
	{
		Reward_points_Link_Button.click();
	}

	
	//customer Change password link button
	
	@FindBy (xpath = "//a[text()='Change password']")
	private WebElement change_Password_Link_Button;
	
	public void Click_change_Password_Link_Button()
	{
		change_Password_Link_Button.click();
	}

}
