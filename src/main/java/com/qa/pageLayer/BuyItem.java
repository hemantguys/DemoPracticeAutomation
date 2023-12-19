package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class BuyItem extends TestBase
{
	public BuyItem()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='/computers'])[1]")
	private WebElement Computer_ddl_menu;
	
	public void Select_From_Computer_DDL()
	{
		Actions act= new Actions(driver);
		act.moveToElement(Computer_ddl_menu).release().perform();
	}
	@FindBy(xpath = "(//a[@href='/desktops'])[1]")
	private WebElement Select_Desktop_Option;
	
	public void Click_Desktop_Option()
	{
        Select_Desktop_Option.click();
	}
	@FindBy(xpath = "//a[text()='Build your own computer']")
	private WebElement Click_Product_toBuy_button;
	
	public void Click_Product_toBuy()
	{
		Click_Product_toBuy_button.click();
	}
	
	@FindBy(xpath = "//input[contains(@id,'add-to-cart-button')]")
	private WebElement Add_To_CartButton;
	
	public void Click_AddToCart()
	{
		Add_To_CartButton.click();
	}

	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement Shopping_Cart_LinkButton;
	
	public void Click_Shopping_Cart_LinkButton()
	{
		Shopping_Cart_LinkButton.click();
	}

	
	
	

	@FindBy(xpath = "//input[@name='termsofservice']")
	private WebElement Term_and_Condition_CheckBox;
	
	public void Click_Term_and_Condition_CheckBox()
	{
		Term_and_Condition_CheckBox.click();
	}


	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement Check_Out_Button;
	
	public void Click_Check_Out_Button()
	{
		Check_Out_Button.click();
	}
	
	@FindBy(xpath = "(//input[@title='Continue'])[1]")
	private WebElement Blling_Address_Confirmation_Button;
	
	public void Click_Blling_Address_Confirmation_Button()
	{
		Blling_Address_Confirmation_Button.click();
	}
	
	@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[2]")
	private WebElement Shippig_Address_Confirmation_Button;
	
	public boolean IsDisplayed_Shippig_Address_Confirmation_Button()
	{
		boolean a=Shippig_Address_Confirmation_Button.isDisplayed();
		System.out.println("Checked");
		return a;
	}
  
	public void Click_Shippig_Address_Confirmation_Button()
	{
		Shippig_Address_Confirmation_Button.click();
	}
	
	@FindBy(xpath = "(//input[@class='button-1 shipping-method-next-step-button'])")
	private WebElement Shippig_Method_Confirmation_Button;
	
	public void Click_Shippig_Method_Confirmation_Button()
	{
		Shippig_Method_Confirmation_Button.click();
	}

	
	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement Payment_Method_Confirmation_Button;
	
	public void Click_Payment_Method_Confirmation_Button()
	{
		Payment_Method_Confirmation_Button.click();
	}

	
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement Payment_info_Confirmation_Button;
	
	public void Click_Payment_info_Confirmation_Button()
	{
		Payment_info_Confirmation_Button.click();
	}
	
	
	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement Confirm_Order_Button;
	
	public void Click_Confirm_Order_Button()
	{
		Confirm_Order_Button.click();
	}
	
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement Successfully_Placed_Orde;
	
	public String Successfully_Placed_Order_text()
	{
	    return Successfully_Placed_Orde.getText();
	}

	
}
