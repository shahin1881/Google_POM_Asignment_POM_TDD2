package com.qa.GmailTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.testCore;

import com.qa.GmailPages.Google_16_Page;
import com.qa.Util.testUtil;

public class Google_16_PageTest extends testCore{

	Google_16_Page Google16Page;
	@BeforeTest
	public void isSkip()
	{
		if(!testUtil.isExecutable("Google_16_PageTest")){
			throw new SkipException("Skipping the testcase as runmode is set to No");
		}
	}
	
	
	
	
	@Test(priority=6)
	public void VerifyAttechmentfileinboxmail() throws InterruptedException{
		Google16Page=new Google_16_Page(driver);
		Google16Page.ClickOnSearchOptionbtn();
		Google16Page.clickOnAllmailbox();
		Google16Page.SelectInboxIndex();
		Google16Page.ClickOnCheckBox();
		Google16Page.clickOnSearchbtn1();
		Google16Page.countNoTotalAttachmt();
		
	}
}
