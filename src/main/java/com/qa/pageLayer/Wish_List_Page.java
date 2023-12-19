package com.qa.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class Wish_List_Page extends TestBase
{
	public Wish_List_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement Add_Product_Wishlist_Button;
	
	public void CLick_Add_Product_Wishlist_Button()
	{
		Add_Product_Wishlist_Button.click();
	}
	
	@FindBy(linkText = "3rd Album")
	private WebElement View_Product_Details_Link_Button;
	
	public void Click_View_Product_Details_Link_Button()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(Add_Product_Wishlist_Button));
		View_Product_Details_Link_Button.click();
	}
	
	
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button']")
	private WebElement Add_to_Cart_button;
	
	public void Click_View_Add_to_Cart_button()
	{
		
		if (Add_to_Cart_button.isEnabled())
		{
			Add_to_Cart_button.click();
		}
		else
		{
			System.out.println("Elemen not interactable");
		}
		
	}
	
	
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement WIshlist_Link_Text;
	
	public void click_WIshlist_Link_Text()
	{
			WIshlist_Link_Text.click();
	}
	
	
	
	
	@FindBy(xpath="//a[text()='3rd Album']")
	private WebElement Item_In_WishLIst;
	
	public String Check_Item_In_WishLIst()
	{
		  return Item_In_WishLIst.getText();
		
	}
	
	
	
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public void  ()
//	{
//		
//	}
//	
//	
//	
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public void  ()
//	{
//		
//	}
//	
//	
//	@FindBy(xpath="")
//	private WebElement ;
//	
//	public void  ()
//	{
//		
//	}
//	
	
	

}
