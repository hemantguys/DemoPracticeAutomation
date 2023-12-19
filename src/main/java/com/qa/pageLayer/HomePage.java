package com.qa.pageLayer;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase
{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='account'])[1]")
	private WebElement Cutomer_ID_link_button;
	
	public void Click_Cutomer_ID_link_button()
	{
		Cutomer_ID_link_button.click();
	}
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement Logo_Check;
	
	public boolean Check_Logo()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Tricentis Demo Web Shop']")));
		return logoElement.isDisplayed();
	}
	
	
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LoginLinkButton;
	
	public void Click_Login_LingButton()
	{
		LoginLinkButton.click();
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement Register_account_LinkButton;
	
	public void Click_Register_account_LinkButton()
	{
		Register_account_LinkButton.click();
	}
	
	
	
	@FindBy(xpath = "//a[text()='Facebook']")
	private WebElement FaceBookLinkbutton;
	
	public void Click_FaceBook_LinkButton()
	{
		FaceBookLinkbutton.click();
	}
	
	
	
	@FindBy(xpath = "//a[text()='Twitter']")
	private WebElement Twitter_LinkButton;
	
	public void Click_Twitter_LinkButton()
	{
		Twitter_LinkButton.click();
	}
	
	
	
	@FindBy(xpath = "//a[text()='YouTube']")
	private WebElement Youtube_Link_Button;
	
	public void Click_Youtube_LInkbutton()
	{
		Youtube_Link_Button.click();
	}
	
	
	
	
	
	@FindBy(xpath = "//a[text()='Google+']")
	private WebElement Google_link_Button;
	
	public void Click_Google_LInkbutton()
	{
		Google_link_Button.click();
	}
	
	
	
	
	@FindBy(xpath = "//a[text()='Contact us']")
	private WebElement Contact_Us_Button;
	
	public void Click_ContactUs_LInkbutton()
	{
		Contact_Us_Button.click();
	}
	
	
	//click Digital downloads button 
	
	@FindBy(xpath="//ul[@class='top-menu']//a[normalize-space()='Digital downloads']")
	private WebElement Digital_Download_link_MenuBar;
	
	public void  Click_Digital_Download_link_MenuBar()
	{
		Digital_Download_link_MenuBar.click();
	}
	
    @FindBy(xpath = "//input[@id='small-searchterms']")
    private WebElement Search_Product_SearchBar;
    
    public void Enter_ProductIn_Search_Product_SearchBar(String item)
    {
    	Search_Product_SearchBar.sendKeys(item);
    }

    
    
    @FindBy(xpath = "//input[@class='button-1 search-box-button']")
    private WebElement Search_Product_button;
    
    public void Click_ProductIn_Search_Product_button()
    {
    	Search_Product_button.click();
    }
    
    @FindBy (xpath = "(//span[@class='cart-label'])[1]")
    private WebElement add_to_WishList_Linkbutton;
    
    
    public void Clic_add_to_WishList_Linkbutton()
    {
    	add_to_WishList_Linkbutton.click();
    }
}
