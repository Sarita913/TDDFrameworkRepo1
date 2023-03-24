package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TranactionPage;
import com.ds.testBase.TestBase;

public class TranactionTest extends TestBase {

	@Test
	public void getDataFromTransactionPage() throws InterruptedException
	{
		LoginPage login_obj = new LoginPage(driver);
		DashboardPage dash_obj = new DashboardPage(driver);
		TranactionPage tran_obj = new TranactionPage(driver);
		login_obj.enterEmailAddress("amarwaghmare573@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		dash_obj.clickOnTranactionLink();
		tran_obj.getAllData();
	}
}
