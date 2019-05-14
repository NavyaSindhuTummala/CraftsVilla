package com.gmail.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gmail.generic.BasePage;

public class GmailHomePage extends BasePage

{

	/*@FindBy(xpath="//input[@type='email']")
	private WebElement userId;
	
	@FindBy(xpath="//span[@class='RveJvd snByac']")
	private WebElement userNext;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement userPassword;
	
	@FindBy (xpath="//div[@id='passwordNext']//span[@class='RveJvd snByac']")
	private WebElement loginButton;  */
	
	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement composeButton;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement sendToBox;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subjectBox;
	
	@FindBy(xpath="///div[@aria-label='Message Body']")
	private WebElement messageBody;
	
	@FindBy(xpath="//div[@aria-label='Send ‪(Ctrl-Enter)‬']")
	private WebElement sendButton;
		
//Initialization
	
	public GmailHomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public void clickOncomposeButton()
	{
		try
		{
			verifyElementPresent(composeButton);
			composeButton.click();
			log.info("Clicked on:" +composeButton);
		}
		catch(Exception e)
		{
			log.error("Unable click on" +composeButton+":" +e);
		}
	}
	
	public void setsendToBox( String mailId)
	{
		try
		{
			verifyElementPresent(sendToBox);
			sendToBox.sendKeys(mailId);
			log.info(mailId+"has been set to:" +sendToBox);
		}
		catch(Exception e)
		{
			log.error("MailId is not Available:" +e);
		}
	}
	
	public void setsubjectBox( )
	{
		try
		{
			verifyElementPresent(subjectBox);
			subjectBox.sendKeys("TestMail");
			log.info("Subject has been set to:" +subjectBox);
		}
		catch(Exception e)
		{
			log.error("Subject is not Available:" +e);
		}
	}
	
	public void setmessageBody( )
	{
		try
		{
			verifyElementPresent(messageBody);
			messageBody.sendKeys("Test --- Test");
			log.info("Message body:" +messageBody);
		}
		catch(Exception e)
		{
			log.error("Message body is not Available:" +e);
		}
	}

	public void clickOnsendButton()
	{
		try
		{
			verifyElementPresent(sendButton);
			sendButton.click();
			log.info("Clicked on:" +sendButton);
		}
		catch(Exception e)
		{
			log.error("Unable click on" +sendButton+":" +e);
		}
	}

}
