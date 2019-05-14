package com.flipkart.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.generic.BaseTest;
import com.flipkart.pompages.FlipkartHomePage;


public class FlipkarHomePageScripts extends BaseTest
{
	FlipkartHomePage homePage = null;

	@Test
	public void TC_01_ComposeAMail()
	{
		homePage = new FlipkartHomePage(driver);
		
		try
		{
			homePage.setSearchText("Selenium Book");
			homePage.clickseleniumBookLink();
			homePage.setpinCode();
			homePage.clickOnaddToCart();
			homePage.clickOnplaceOrder();
			homePage.setemailId("youremail@email.com");
			homePage.clickOncontinueButton();
		//	Assert.fail();
			
			
		}
		catch(Exception e)
		{
			Reporter.log("Test case failed : "+e);
		}
	
     }
	
	

}
