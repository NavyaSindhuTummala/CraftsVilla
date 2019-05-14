package co.edureka.testscripts;

import org.testng.annotations.Test;

import co.edureka.generic.BaseTest;
import co.edureka.generic.ReadExcel;
import co.edureka.pompages.SignInPage;
import co.edureka.pompages.BlogsPage;

public class SignInScripts extends BaseTest
{
	BlogsPage bp = null;
	SignInPage sp = null;
	
	@Test
	public void TC_01_LoginWithSingleCredentials()
	{
		bp = new BlogsPage(driver);
		sp = new SignInPage(driver);
		try {
		String[][] credentials = ReadExcel.getData(FILE_PATH, "Login");
		
		for(int i = 1; i<credentials.length; i++)
		{
			String email = credentials[i][0];
			String password = credentials[i][1];
			
			bp.clickOnlogInButton();
			sp.setEmail(email);
		//	sp.clickOnContinue();
			sp.enterPassword(password);
			sp.clickOnLoginButton();
		//	hp.gotoAccount();
		//	hp.clickOnLogout();
		}
		}
		catch(Exception e)
		{
			
		}
	}



}
