package com.qa.testlayer;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.pageLayer.Customer_information;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.My_Account_Details_Pge;
import com.qa.testBase.TestBase;
import com.qa.utilities.ReadConfigFile;

public class Add_New_Address extends TestBase
{
	@Test(invocationCount = 2)
	public void Add_New_Address_Test_0001() throws InterruptedException
	{
		 ReadConfigFile r1= new ReadConfigFile();  // Object of clas which read data from configuraiton file
		 HomePage h1=new HomePage();
		 LoginPage l1= new LoginPage();
		 Customer_information cust=new Customer_information();
		 My_Account_Details_Pge pass= new My_Account_Details_Pge();
		 
		 
		 h1.Click_Login_LingButton();
		 l1.Enter_UserName_textBox(r1.get_username());
		 l1.Enter_Password_textBox(r1.get_password());
		 l1.Click_Login_Button();
		 
		 h1.Click_Cutomer_ID_link_button();
		
		 
		 cust.Click_Customer_Address_Link_Button();
		 
		 pass.Click_Add_Address_Link_Button();
		 
		 pass.Enter_Address_FirstName_TextBox("Jaswant");
		 pass.Enter_Address_LastName_TextBox("Singh");
		 pass.Enter_Address_Email_TextBox("abc@gmail.com");
		 pass.Enter_Address_Company_TextBox("Bebo tech");
		 Thread.sleep(3000);
		 pass.Enter_Address_CountryId_TextBox("Canada");
		 Thread.sleep(3000);
		 pass.Enter_Address_StateProvinceId_TextBox("Manitoba");
		 
		 
         pass.Enter_Address_City_TextBox("Test city");
		 pass.Enter_Address_Address1_TextBox("Goal chakker");
		 pass.Enter_Address_Address2_TextBox("Sabzi mandi");
		 pass.Enter_Address_ZipPostalCode_TextBox("151502");
		 pass.Enter_Address_PhoneNumber_TextBox("9815925959");
		 pass.Enter_Address_FaxNumber_TextBox("2334234234234");
		 pass.Click_Add_New_Address_Button();
		System.out.println("9823423489");
		 
		 
	}
	
	@Test
	public void delete_Existing_Address_test() throws InterruptedException
	{
		 ReadConfigFile r1= new ReadConfigFile();  // Object of clas which read data from configuraiton file
		 HomePage h1=new HomePage();
		 LoginPage l1= new LoginPage();
		 Customer_information cust=new Customer_information();
		 My_Account_Details_Pge pass= new My_Account_Details_Pge();
		 
		 
		 h1.Click_Login_LingButton();
		 l1.Enter_UserName_textBox(r1.get_username());
		 l1.Enter_Password_textBox(r1.get_password());
		 l1.Click_Login_Button();
		 
		 h1.Click_Cutomer_ID_link_button();
		 
		 cust.Click_Customer_Address_Link_Button();
		 
		//pass.Click_Add_Address_Link_Button()  andidfsdfjlasdfsdf;
        int No_of_Addresses=pass.Count_List_Of_Address_Exist();
		 
		 
		 
		while(No_of_Addresses>0)
		{
			
			pass.Click_Delete_Address_button();
			Thread.sleep(1000);
		    Alert alt=	driver.switchTo().alert();
		    alt.accept();
			Thread.sleep(1000);

			No_of_Addresses=pass.Count_List_Of_Address_Exist();
		
		}
	}
	

}
