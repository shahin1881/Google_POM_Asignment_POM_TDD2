package com.qa.GmailTestCases;

import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.Base.testCore;
import com.qa.GmailPages.Google_11_Page;
import com.qa.GmailPages.Google_12_Page;
import com.qa.Util.testUtil;



public class Google_12_PageTest extends testCore{
	
	
	Google_12_Page Google12Page;
	
	public SoftAssert softassert;
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_12_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	
	@Test(priority=2)
	public void UnreadEmailCount() throws InterruptedException{
		//Thread.sleep(2000);
		//driver.navigate().back();
		
		softassert = new SoftAssert();
		
		Google12Page = new Google_12_Page(driver);
		Google12Page.CountUnreadEmailInbox();
		Thread.sleep(2000);
		Google12Page.ReadEmailInbox();
		
		//softAssert.assertAll();
		
		
		
	}
	
	
	
	
	
	
}



