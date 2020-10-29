package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.Base.testCore;

import com.qa.GmailPages.Google_13_Page;
import com.qa.Util.testUtil;

public class Google_13_PageTest extends testCore{

	Google_13_Page Google13Page;
public SoftAssert softassert;
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_13_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	
	
	@Test(priority=3)
	public void gmailcomposeTest() throws InterruptedException{
		Thread.sleep(5000);
		softassert = new SoftAssert();
		
		Google13Page = new Google_13_Page(driver);
		Google13Page.ClickCompose();
		Thread.sleep(2000);
		Google13Page.checkComposebody();
		
	
		softassert.assertAll();
		
}
}