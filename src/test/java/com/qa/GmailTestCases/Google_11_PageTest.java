package com.qa.GmailTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.Base.testCore;
import com.qa.GmailPages.Google_11_Page;

import com.qa.Util.testUtil;

public class Google_11_PageTest extends testCore {

	Google_11_Page Google11Page;
    SoftAssert softassert;

	@BeforeTest
	public void isSkip() {
		if (!testUtil.isExecutable("Google_11_PageTest")) {
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	
	@Test(priority=1,dataProvider = "getData")
	public void doLogin(String email, String password) throws IOException, InterruptedException {
		try {
			 softassert = new SoftAssert();
			app_logs.debug("Executing login Test");
			Google11Page = new Google_11_Page(driver);
			Google11Page.signin();
			Thread.sleep(3000L);

			Google11Page.username().sendKeys(email);
			Google11Page.nextbtn1().click();
			Thread.sleep(5000);
			Google11Page.password().sendKeys(password);
			Google11Page.nextbtn2().click();
			Thread.sleep(3000);
			Google11Page.signin1();

			Google11Page.clickStarred();
			
			
			//softAssert.assertAll();
			/*Thread.sleep(3000);
			driver.navigate().back();*/

		} catch (Throwable t) {
			testUtil.captureScreenshot("Google_11_PageTest");
			Assert.assertTrue(false, t.getMessage());

		}
	}

	// Reading data from the Excel File
	@DataProvider
	public Object[][] getData() {

		return testUtil.getData("LoginTest");

	}

}
