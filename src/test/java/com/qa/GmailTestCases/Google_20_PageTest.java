package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.testCore;

import com.qa.GmailPages.Google_20_Page;
import com.qa.Util.testUtil;

public class Google_20_PageTest extends testCore {

	Google_20_Page Google20Page;
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_20_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=10)
	public void VerifyGmailAccountSignout() throws InterruptedException{
		Google20Page=new Google_20_Page(driver);
		Google20Page.GmailSignout();
	}
	
}
