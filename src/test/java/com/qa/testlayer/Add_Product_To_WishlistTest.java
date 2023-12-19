package com.qa.testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.Wish_List_Page;
import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfigFile;

public class Add_Product_To_WishlistTest extends TestBase
{
	@Test
	public void Add_and_Check_Product_In_Wishlist()
	{
		ReadConfigFile r1= new ReadConfigFile();
		HomePage h1=new HomePage();
		LoginPage l1=new LoginPage();
		Wish_List_Page w1= new Wish_List_Page();
		
		
		h1.Click_Login_LingButton();
		logg.info("Login button clicked to go to Login page");
		l1.Enter_UserName_textBox(r1.get_username());
		logg.info("Username entered");
		l1.Enter_Password_textBox(r1.get_password());
		logg.info("Password entered");
		l1.Click_Login_Button();
		logg.info("Login button clicked to login");
		
		h1.Enter_ProductIn_Search_Product_SearchBar("3rd Album");
		logg.info("Entered product to search in Search box ");
		h1.Click_ProductIn_Search_Product_button();
		logg.info("Click search button to search product");
		w1.Click_View_Product_Details_Link_Button();
		logg.info("Click view product details link button ");
		w1.CLick_Add_Product_Wishlist_Button();
		logg.info("Click add product to Wishlist button ");
		w1.click_WIshlist_Link_Text();
		logg.info("Wishlist link button clicked");
		logg.info("Wishlist link button clicked");
	    String actual_result =	w1.Check_Item_In_WishLIst();
	    assertEquals(actual_result, "3rd Album");
		
		
	}

}
