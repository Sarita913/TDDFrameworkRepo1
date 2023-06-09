package com.ds.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- obj repo -----------------
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_txtbox;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement select_option;
	
	//------------ action methods -------------
	
	public void enterCompanyName(String company_name)
	{
		search_txtbox.sendKeys(company_name);
	}
	
	public void clickOnOption()
	{
		select_option.click();;
	}
}
