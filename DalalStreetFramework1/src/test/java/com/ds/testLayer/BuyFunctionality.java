package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class BuyFunctionality extends TestBase {
	
	@Test
	public void verifyBuyFunctionality() throws InterruptedException
	{
		LoginPage login_obj = new LoginPage(driver);
		DashboardPage dash_obj = new DashboardPage(driver);
		ExchangePage exchange_obj = new ExchangePage(driver);
		login_obj.enterEmailAddress("Shetesarita@gmail.com");
		login_obj.enterPassword("@Test13jully");
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj.clickOnBuyButton1();
		exchange_obj.enterQuanity("2");
		exchange_obj.clickOnBuyButton2();
	}

}
