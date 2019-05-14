package com.gmail.testscripts;


import org.testng.annotations.Test;


import com.gmail.generic.BaseTest;
import com.gmail.generic.ReadExcel;
import com.gmail.pompages.GmailHomePage;
import com.gmail.pompages.SignInPage;

public class SignInScripts extends BaseTest
{
	GmailHomePage hp = null;
	SignInPage sp = null;
	
	@Test
	public void TC_01_LoginWithSingleCredential()
	{
		hp = new GmailHomePage(driver);
		sp = new SignInPage(driver);
		try {
		String[][] credentials = ReadExcel.getData(FILE_PATH, "Login");
		
		for(int i = 1; i<credentials.length; i++)
		{
			String email = credentials[i][0];
			String password = credentials[i][1];
			
		//	hp.clickOnSignInButton();
			sp.setEmail(email);
			sp.clickOnContinue();
			sp.enterPassword(password);
			sp.clickOnContinue();
		//	hp.gotoAccount();
		//  hp.clickOnLogout();
		}
		}
		catch(Exception e)
		{
			
		}
	}
}
