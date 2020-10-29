package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_17_Page extends testCore {

	WebDriver driver;

	public Google_17_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

   @FindBy(xpath = configuration.Settingbtn)
    public WebElement Settingbtn;

   @FindBy(xpath = configuration.allSetting)
   public WebElement allSetting;

	@FindBy(xpath = configuration.SettingsTxt)
	public WebElement SettingsTxt;

	
	public void VerifySettingbtn() {
		  Settingbtn.click();

	}

   public void VerifyAllSettingbtn() throws InterruptedException {
	Thread.sleep(2000);
	 boolean allSettingbtn=allSetting.isEnabled();
		 Assert.assertTrue(allSettingbtn);
		 System.out.println("verify allSetting button is paresent");
		 Thread.sleep(3000);
		 allSetting.click();
		 
}

	public void VerifySettingsText() throws InterruptedException {
		Thread.sleep(2000);
		boolean SettingsTxt1 = SettingsTxt.isEnabled();
		Assert.assertTrue(SettingsTxt1);
		System.out.println("verify SettingsTxt is paresent");
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
