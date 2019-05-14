package co.edureka.pompages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.edureka.generic.BasePage;

public class BlogsPage extends BasePage
{
	@FindBy(linkText="Log In")
	private WebElement logInButton;
	
	@FindBy(xpath="//div[@class='col-lg-4 col-md-4 col-sm-4 col-xs-6 no-padding index_link']//a[@href='https://www.edureka.co/blog']")
	private WebElement BlogLink;
	
	@FindBy(xpath="//i[@class='icon-Software_testing category-icon']")
	private WebElement SoftwareTestingLink;
	
	@FindBy(xpath="//div[@class='course-content d-none d-xl-block d-lg-block']//a[@data-category='Software Testing']")
	private WebElement seleniumWebdriverLink;
	
	@FindBy(xpath="//span[text()='Selenium Interview Questions']")
	private WebElement seleniumInteriewQuestionLink;
	
	
		
	public BlogsPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnlogInButton()
	{
		try
		{
			verifyElementPresent(logInButton);
			logInButton.click();
			log.info("clicked on "+logInButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+logInButton+e);
		}
	}
	
	
	public void clickOnBlogLink()
	{
		try
		{
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
			verifyElementPresent(BlogLink);
			BlogLink.sendKeys(selectLinkOpeninNewTab);
			BlogLink.click();
			log.info("clicked on "+BlogLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+BlogLink+e);
		}
		

	}
	
	public void clickOnSoftwareTestingLink()
	{
		try {
		verifyElementPresent(SoftwareTestingLink);
		SoftwareTestingLink.click();
		log.info("Clicked on "+SoftwareTestingLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+SoftwareTestingLink+e);
		}
		
	}
	
	public void clickOnseleniumWebdriverLink()
	{
		try {
		verifyElementPresent(seleniumWebdriverLink);
		seleniumWebdriverLink.click();
		log.info("Clicked on "+seleniumWebdriverLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+seleniumWebdriverLink+e);
		}
		
	}
	
	public void clickOnseleniumInteriewQuestionLink()
	{
		try {
		verifyElementPresent(seleniumInteriewQuestionLink);
		seleniumInteriewQuestionLink.click();
		log.info("Clicked on "+seleniumInteriewQuestionLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+seleniumInteriewQuestionLink+e);
		}
		
	}
	
}