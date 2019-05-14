package co.edureka.testscripts;

import org.testng.Reporter;


import org.testng.annotations.Test;

import co.edureka.generic.BaseTest;
import co.edureka.pompages.BlogsPage;


public class BlogsPageScripts extends BaseTest 
{

	BlogsPage homePage = null;

	@Test
	public void TC_01_SeleniumBlogs()
	{
		homePage = new BlogsPage(driver);
		
		try
		{
			homePage.clickOnlogInButton();
			homePage.clickOnBlogLink();
			homePage.clickOnSoftwareTestingLink();
			homePage.clickOnseleniumWebdriverLink();
			homePage.clickOnseleniumInteriewQuestionLink();
			
			
		}
		catch(Exception e)
		{
			Reporter.log("Test case failed : "+e);
		}
	
     }
	
}
