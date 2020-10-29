package com.qa.GmailTestCases;


import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.testCore;

import com.qa.GmailPages.Google_17_Page;
import com.qa.Util.testUtil;

public class Google_17_PageTest extends testCore{

	Google_17_Page Google17Page;
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_17_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	@Test(priority=7)
	public void VerifyCreateNewLabelLink() throws InterruptedException{
		Google17Page= new Google_17_Page(driver);
		Google17Page.VerifySettingbtn();
		Google17Page.VerifyAllSettingbtn();
		Google17Page.VerifySettingsText();
	}
	
}