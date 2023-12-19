package com.qa.pageLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class My_Account_Details_Pge extends TestBase
{
	public My_Account_Details_Pge()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='OldPassword']")
	private WebElement Old_Password_TestBox;
	
	public void Enter_Old_Password_TestBox(String OldPassword)
	{
		Old_Password_TestBox.sendKeys(OldPassword);
	}

	
	@FindBy(xpath = "//input[@id='NewPassword']")
	private WebElement New_Password_TestBox;
	
	public void Enter_New_Password_TestBox(String NewPassword)
	{
		New_Password_TestBox.sendKeys(NewPassword);
	}

	
	
	@FindBy(xpath = "//input[@id='ConfirmNewPassword']")
	private WebElement Confirm_New_Password_TestBox;
	
	public void Enter_Confirm_New_Password_TestBox(String Con_New_Password)
	{
		Confirm_New_Password_TestBox.sendKeys(Con_New_Password);
	}

	
	@FindBy(xpath = "//input[@class='button-1 change-password-button']")
	private WebElement Change_Password_Button;
	
	public void Click_Change_Password_Button()
	{
		Change_Password_Button.click();
	}
	
	@FindBy(xpath = "//div[@class='result']")
	private WebElement Get_Change_Password_Message_Label;
	
	public String Get_Change_Password_Message_Label()
	{
		String s1= Get_Change_Password_Message_Label.getText();
		return s1;
	}
	
	

	//Add address fields 
	
     // Click Address link  to add address
	@FindBy(xpath  = "//input[@class='button-1 add-address-button']")
	private WebElement Add_Address_Link_Button;
	
	
	public void Click_Add_Address_Link_Button()
	{
		Add_Address_Link_Button.click();
	}
	
	//Address User first name
	
	@FindBy(xpath = "//input[@id='Address_FirstName']")
	private WebElement Address_FirstName_TextBox;
	
	public void Enter_Address_FirstName_TextBox(String Address_FirstName)
	{
		Address_FirstName_TextBox.sendKeys(Address_FirstName);
	}
	
	
	//Address User Last name
	@FindBy(xpath = "//input[@id='Address_LastName']")
	private WebElement Address_LastName_TextBox;
	
	public void Enter_Address_LastName_TextBox(String Address_LastName)
	{
		Address_LastName_TextBox.sendKeys(Address_LastName);
	}
	
	
	
	//Address User Email
	
	@FindBy(xpath = "//input[@id='Address_Email']")
	private WebElement Address_Email_TextBox;
	
	public void Enter_Address_Email_TextBox(String Address_Email)
	{
		Address_Email_TextBox.sendKeys(Address_Email);
	}
	
	
	//Address User Company
	
	@FindBy(xpath = "//input[@id='Address_Company']")
	private WebElement Address_Company_TextBox;
	
	public void Enter_Address_Company_TextBox(String Address_Company)
	{
		Address_Company_TextBox.sendKeys(Address_Company);
	}
	
	
	//Address User Country
	
	@FindBy(xpath = "//select[@id='Address_CountryId']")
	private WebElement Address_CountryId_TextBox;
	
	public void Enter_Address_CountryId_TextBox(String Address_CountryId)
	{
		Select select_country = new Select(Address_CountryId_TextBox);
		select_country.selectByIndex(2);;
		
	}
	
	

	
	//select[@id='Address_CountryId']
	
	//select[@id='Address_StateProvinceId']
	
	@FindBy(xpath = "//select[@id='Address_StateProvinceId']")
	private WebElement Address_StateProvinceId_ddl;
	
	public void Enter_Address_StateProvinceId_TextBox(String Address_StateProvinceId)
	{
		Select select_stateid = new Select(Address_StateProvinceId_ddl);
		select_stateid.selectByIndex(2);;
		
	}
	

	
	@FindBy(xpath = "//input[@id='Address_City']")
	private WebElement Address_City_TextBox;
	
	public void Enter_Address_City_TextBox(String Address_City)
	{
		Address_City_TextBox.sendKeys(Address_City);
		
	}
	
	
	//input[@id='Address_Address1']
	
	
	@FindBy(xpath = "//input[@id='Address_Address1']")
	private WebElement Address_Address1_TextBox;
	
	public void Enter_Address_Address1_TextBox(String Address_Address1)
	{
		Address_Address1_TextBox.sendKeys(Address_Address1);
	}
	
	
	//input[@id='Address_Address2']
	
	
	
	@FindBy(xpath = "//input[@id='Address_Address2']")
	private WebElement Address_Address2_TextBox;
	
	public void Enter_Address_Address2_TextBox(String Address_Address2)
	{
		Address_Address2_TextBox.sendKeys(Address_Address2);
	}
	
	//input[@id='Address_ZipPostalCode']
	
	@FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
	private WebElement Address_ZipPostalCode_TextBox;
	
	public void Enter_Address_ZipPostalCode_TextBox(String Address_ZipPostalCode)
	{
		Address_ZipPostalCode_TextBox.sendKeys(Address_ZipPostalCode);
	}
	
	//input[@id='Address_PhoneNumber']
	
	@FindBy(xpath = "//input[@id='Address_PhoneNumber']")
	private WebElement Address_PhoneNumber_TextBox;
	
	public void Enter_Address_PhoneNumber_TextBox(String Address_PhoneNumber)
	{
		Address_PhoneNumber_TextBox.sendKeys(Address_PhoneNumber);
	}
	
	//input[@id='Address_FaxNumber']
	
	@FindBy(xpath = "//input[@id='Address_FaxNumber']")
	private WebElement Address_FaxNumber_TextBox;
	
	public void Enter_Address_FaxNumber_TextBox(String Address_FaxNumber)
	{
		Address_FaxNumber_TextBox.sendKeys(Address_FaxNumber);
	}
	
	
	//input[@class='button-1 save-address-button']
	@FindBy(xpath = "//input[@class='button-1 save-address-button']")
	private WebElement Add_New_Address_Button;
	
	public void Click_Add_New_Address_Button()
	{
		Add_New_Address_Button.click();;
	}
	
	
	@FindBy(xpath = "//input[@value='Delete']")
	private List<WebElement> CountLIstof_Addresses;
	
	public int Count_List_Of_Address_Exist()
	{
		return CountLIstof_Addresses.size();
	}
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement Delete_Addresses;
	
	
	public void Click_Delete_Address_button()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(Delete_Addresses));
		Delete_Addresses.click();
	}
	
	
	@FindBy(partialLinkText = "No addresses")
	private WebElement No_Address_In_Addresslist;
	
	public boolean Check_No_Address_In_Address_LIst()
	{
		return No_Address_In_Addresslist.isDisplayed();
	}
	
	
}
