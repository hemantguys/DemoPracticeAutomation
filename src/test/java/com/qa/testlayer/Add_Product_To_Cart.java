package com.qa.testlayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.BuyItem;
import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfigFile;

public class Add_Product_To_Cart extends TestBase
{
	@Test
	public void Add_To_Cart_Test()
	{
		HomePage h1= new HomePage();
		ReadConfigFile RC1=new ReadConfigFile();
		logg.info("Enter product name in Search box");
		h1.Enter_ProductIn_Search_Product_SearchBar(RC1.getProductToBuy());
		logg.info("Click Search Product button");
		h1.Click_ProductIn_Search_Product_button();
	}

}
