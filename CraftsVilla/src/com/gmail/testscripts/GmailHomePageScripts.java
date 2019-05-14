package com.gmail.testscripts;


import org.testng.Reporter;

import org.testng.annotations.Test;

import com.gmail.generic.BaseTest;
import com.gmail.pompages.GmailHomePage;


public class GmailHomePageScripts extends BaseTest 
{

	GmailHomePage homePage = null;

	@Test
	public void TC_01_ComposeAMail()
	{
		homePage = new GmailHomePage(driver);
		
		try
		{
			homePage.clickOncomposeButton();
			homePage.setsendToBox("kavuri.harish@gmail.com");
			homePage.setsubjectBox();
			homePage.setmessageBody();
			homePage.clickOnsendButton();
			
			
		}
		catch(Exception e)
		{
			Reporter.log("Test case failed : "+e);
		}
	
     }
	
}
