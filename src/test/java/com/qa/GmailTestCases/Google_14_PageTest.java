package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.Base.testCore;
import com.qa.GmailPages.Google_13_Page;
import com.qa.GmailPages.Google_14_Page;
import com.qa.Util.testUtil;

public class Google_14_PageTest extends testCore{
	Google_13_Page Google13Page;
	Google_14_Page Google14Page;
	public SoftAssert softassert;
	
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_14_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}

	
	@Test(priority=4)
	public void Sendemailverify() throws InterruptedException{
		
		//Thread.sleep(2000);
		softassert = new SoftAssert();
		//Google13Page=new Google_13_Page(driver);
		Google14Page=new Google_14_Page(driver);
		Google14Page.sendmailTo();
		Google14Page.sendmailsubject();
		Google14Page.SendMsgBox();
		Google14Page.sendmailsendbttan();
		//Thread.sleep(3000);
		Google14Page.Sentemailbox();
		Google14Page.verifySentinbixemail();
		softassert.assertAll();
	}
	
	
	
	
}
