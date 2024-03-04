package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//===================== object repository ================================
	@FindBy (xpath="//a[contains(text(),'Sign in')]")
	private WebElement signin_link;
	@FindBy (xpath="//body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	private WebElement shop_link;
	
	
	
	
	
	//===================== action methods ===================================
	public void click_on_signin_link()
	{
		signin_link.click();
	}
	public void clickOnShopLink()
	{
		shop_link.click();
	}
	
}
