package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.testCore;
import com.qa.GmailPages.Google_15_Page;
import com.qa.Util.testUtil;

public class Google_15_PageTest extends testCore{
	
	Google_15_Page Google15Page;
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_15_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	
	
	
	
	
	
	@Test(priority=5)
	public void VerifySearchEmailInbox() throws InterruptedException{
		Google15Page=new Google_15_Page(driver);
		/*Thread.sleep(2000);
		driver.navigate().back();*/
		Google15Page.VerifySearchMailbox();
		Google15Page.VerifySearchbtnicon();
		Google15Page.VerifySearchInbox();
		
	}
}
