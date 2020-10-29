package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.testCore;
import com.qa.GmailPages.Google_18_Page;
import com.qa.Util.testUtil;

public class Google_18_PageTest extends testCore{

	
	Google_18_Page Google18Page;
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_18_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=8)
	public void CreateNewLabel() throws InterruptedException{
		Google18Page=new Google_18_Page(driver);
		Google18Page.VerifyCreateLabelLink();
	}
}
