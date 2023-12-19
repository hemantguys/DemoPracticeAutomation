package com.qa.testlayer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pageLayer.BuyItem;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.Wish_List_Page;
import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfigFile;

public class Buy_ComputerTest extends TestBase
{
	@Test
	public void Buy_Desktop_Computer_Test() throws InterruptedException
	{
		HomePage h1= new HomePage();
	//	LoginPage l1=new LoginPage();
		ReadConfigFile r1=new ReadConfigFile();
		BuyItem b1=new BuyItem();
		Wish_List_Page w1=new Wish_List_Page();
		LoginTest login1=new LoginTest();
		Add_Product_To_Cart aptc=new Add_Product_To_Cart();
		
		
//		h1.Click_Login_LingButton();
//		l1.Enter_UserName_textBox(r1.get_username());
//		l1.Enter_Password_textBox(r1.get_password());
//		l1.Click_Login_Button();
//		
		//Used login test script here
		login1.LoginTestcase();
		
		
		//Used Add to cart test here
		aptc.Add_To_Cart_Test();
		
		logg.info("Click Add to cart button");
		w1.Click_View_Add_to_Cart_button();
	
		Thread.sleep(3000);
	
		logg.info("Click shopping cart ");
		b1.Click_Shopping_Cart_LinkButton();
		logg.info("Check box of term and condition clicked");
		b1.Click_Term_and_Condition_CheckBox();
		logg.info("Click check out button");
		b1.Click_Check_Out_Button();
		logg.info("Clicked Billing address confirmation button");
		Thread.sleep(2000);
		b1.Click_Blling_Address_Confirmation_Button();
		
		Thread.sleep(2000);
		if(b1.IsDisplayed_Shippig_Address_Confirmation_Button()==true)
		{
			logg.info("Clicked Shipping address confirmation button");
			b1.Click_Shippig_Address_Confirmation_Button();
			Thread.sleep(2000);
			logg.info("Clicked Shipping Method confirmation button");
			b1.Click_Shippig_Method_Confirmation_Button();
			
		}
		
		logg.info("Clicked payment method confirmation button");
		Thread.sleep(2000);
		b1.Click_Payment_Method_Confirmation_Button();
		logg.info("Clicked payment info confirmation button");
		b1.Click_Payment_info_Confirmation_Button();
		logg.info("Clicked order confirmation button");
		b1.Click_Confirm_Order_Button();
		logg.info("Successfully placed");
		String actual = b1.Successfully_Placed_Order_text();
		assertEquals(actual, "Your order has been successfully processed!");
	}

}
