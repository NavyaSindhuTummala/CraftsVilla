package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LehangasPage extends HomePage
{

	@FindBy(id="priceOrder_ASC")
	private WebElement priceOrder;
	
	@FindBy(xpath="//label[@title='Above 5000']")
	private WebElement priceValue;
	
	@FindBy(id="clear_Sleeves")
	private WebElement sleevesLink;
	
	@FindBy(xpath="//label[@class='js-filter-label']//input[@value='elbow sleeve']")
	private WebElement elbowSleeves;
	
	@FindBy(xpath="//a[@href='/catalog/product/view/id/6205428/s/craftsvilla-pink-silk-blend-woven-designer-lehenga-choli']")
	private WebElement pinkSilkLehenga;
	
	
	
	//Initialization
	public LehangasPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
				
		public void clickOnpriceOrder()
		{
			try
			{
				verifyElementPresent(priceOrder);
				priceOrder.click();
				log.info("Clicked on:" +priceOrder);
			}
			catch(Exception e)
			{
				log.error("Unable click on" +priceOrder+":" +e);
			}
		}
		
		public void selectpriceValue()
		{
			try
			{
				verifyElementPresent(priceValue);
				priceValue.click();
				log.info("Selected the :" +priceValue);
			}
			catch(Exception e)
			{
				log.error("Unable select the" +priceValue+":" +e);
			}
		}
		
		public void clickOnSleevesLink()
		{
			try
			{
				verifyElementPresent(sleevesLink);
				sleevesLink.click();
				log.info("Clicked on:" +sleevesLink);
			}
			catch(Exception e)
			{
				log.error("Unable click on" +sleevesLink+":" +e);
			}
		}
		
		public void selectElbowSleeves()
		{
			try
			{
				verifyElementPresent(elbowSleeves);
				elbowSleeves.click();
				log.info("Selected the:" +elbowSleeves);
			}
			catch(Exception e)
			{
				log.error("Unable select the" +elbowSleeves+":" +e);
			}
		}
	
		public void selectPinkSilkLehenga()
		{
			try
			{
				verifyElementPresent(pinkSilkLehenga);
				pinkSilkLehenga.click();
				log.info("Selected the:" +pinkSilkLehenga);
			}
			catch(Exception e) 
			{
				log.error("Unable select the" +pinkSilkLehenga+":" +e);
			}
		}
}
