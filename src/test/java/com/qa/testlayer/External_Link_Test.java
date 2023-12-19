package com.qa.testlayer;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class External_Link_Test extends TestBase
{
	@Test
	public void External_Link_Testcase() throws InterruptedException
	{
		HomePage h1=new HomePage();
		h1.Click_FaceBook_LinkButton();
		String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle); // Switch to the child window
            }
        }
        String url= driver.getCurrentUrl();
        driver.close();
		Assert.assertEquals(url, "https://www.facebook.com/nopCommerce");
		driver.switchTo().window(parentWindowHandle);
		
		h1.Click_Twitter_LinkButton();
		String parentWindowHandle2 = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle2)) {
                driver.switchTo().window(windowHandle); // Switch to the child window
            }
        }
        String url2= driver.getCurrentUrl();
        driver.close();
		Assert.assertEquals(url2, "https://twitter.com/nopCommerce");
		driver.switchTo().window(parentWindowHandle);
		
		
		h1.Click_Google_LInkbutton();
	
		String parentWindowHandle3 = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle3)) {
                driver.switchTo().window(windowHandle); // Switch to the child window
            }
        }
        String url3= driver.getCurrentUrl();
        driver.close();
		Assert.assertEquals(url3, "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html");
		driver.switchTo().window(parentWindowHandle);
		
		h1.Click_Youtube_LInkbutton();
		String parentWindowHandle4 = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle4)) {
                driver.switchTo().window(windowHandle); // Switch to the child window
            }
        }
        String url4= driver.getCurrentUrl();
        driver.close();
		Assert.assertEquals(url4, "https://www.youtube.com/user/nopCommerce");
		driver.switchTo().window(parentWindowHandle);
		
		Thread.sleep(3000);
	}

}
