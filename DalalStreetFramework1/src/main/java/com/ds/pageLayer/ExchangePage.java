package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {

	public ExchangePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- obj repo -----------------
	@FindBy(xpath="//a[text()='Buy']")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_txtbox;
	
	@FindBy(xpath="//button[text()='Buy']")
	private WebElement buy_btn2;
	
	//------------ action methods -------------
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	public void enterQuanity(String count)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(count);
	}
}
