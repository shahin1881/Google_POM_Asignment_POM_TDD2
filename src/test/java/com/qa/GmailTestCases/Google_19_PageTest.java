package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.testCore;
import com.qa.GmailPages.Google_18_Page;
import com.qa.GmailPages.Google_19_Page;
import com.qa.Util.testUtil;

public class Google_19_PageTest extends testCore{
	Google_19_Page Google19Page;
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_19_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=9)
	public void Emailmovetolabelbox() throws InterruptedException{
		Google19Page=new Google_19_Page(driver);
		Google19Page.EmailMovetoLabel();
	}
}
