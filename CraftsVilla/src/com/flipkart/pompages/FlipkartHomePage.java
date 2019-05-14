package com.flipkart.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generic.BasePage;

public class FlipkartHomePage extends BasePage
{
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@href='/selenium-webdriver-1st/p/itmdwsczsh4mcrfz?pid=9789332526297&lid=LSTBOK9789332526297LO9PMZ&marketplace=FLIPKART&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=576220e3-f52b-4c06-8b09-ef817bd8c986.9789332526297.SEARCH&ppt=Homepage&ppn=Homepage&ssid=enudsqj6wg0000001557059744019&qH=fa7c401decd280db']")
	private WebElement seleniumBookLink;
	
	@FindBy(id="pincodeInputId")
	private WebElement pinCode;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addToCart;
	
	@FindBy(xpath="//button[@class='_2AkmmA _14O7kc _7UHT_c']")
	private WebElement placeOrder;
	
	@FindBy(xpath="//input[@class='_2zrpKA _14H79F']")
	private WebElement emailId;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueButton;
	
	
		
//Initialization
	
	public FlipkartHomePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void setSearchText( String searchString)
	{
		try
		{
			verifyElementPresent(searchBox);
			searchBox.sendKeys(searchString);
			log.info(searchString+"has been set to:" +searchBox);
		}
		catch(Exception e)
		{
			log.error("Search String is not Available:" +e);
		}
	}
	
	public void clickseleniumBookLink( )
	{
		try
		{
			verifyElementPresent(seleniumBookLink);
			seleniumBookLink.click();
			log.info("Selected book is:" +seleniumBookLink);
		}
		catch(Exception e)
		{
			log.error("Selected book is not Available:" +e);
		}
	}
	
	public void setpinCode()
	{
		try
		{
			verifyElementPresent(pinCode);
			pinCode.sendKeys("560103");
			log.info("Pincode has been set to:" +pinCode);
		}
		catch(Exception e)
		{
			log.error("Pincode is not Available:" +e);
		}
	}
	
	public void clickOnaddToCart()
	{
		try
		{
			verifyElementPresent(addToCart);
			addToCart.click();
			log.info("Clicked on:" +addToCart);
		}
		catch(Exception e)
		{
			log.error("Unable click on" +addToCart+":" +e);
		}
	}
	
	public void clickOnplaceOrder()
	{
		try
		{
			verifyElementPresent(placeOrder);
			placeOrder.click();
			log.info("Clicked on:" +placeOrder);
		}
		catch(Exception e)
		{
			log.error("Unable click on" +placeOrder+":" +e);
		}
	}
	
	public void setemailId( String mail)
	{
		try
		{
			verifyElementPresent(emailId);
			emailId.sendKeys(mail);
			log.info(mail+"has been set to:" +emailId);
		}
		catch(Exception e)
		{
			log.error("email id is not Available:" +e);
		}
	}
	
	public void clickOncontinueButton()
	{
		try
		{
			verifyElementPresent(continueButton);
			continueButton.click();
			log.info("Clicked on:" +continueButton);
		}
		catch(Exception e)
		{
			log.error("Unable click on" +continueButton+":" +e);
		}
	}
	

}
