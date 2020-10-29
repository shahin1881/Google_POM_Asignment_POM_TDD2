package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_20_Page extends testCore{
	WebDriver driver;

	public Google_20_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = configuration.LogobtnClick)
	public WebElement LogobtnClick;

	@FindBy(xpath = configuration.signOutClick)
	public WebElement signOutClick;

	@FindBy(xpath = configuration.RemoveanAccount)
	public WebElement RemoveanAccount;

	@FindBy(xpath = configuration.Removeemail)
	public WebElement Removeemail;

	@FindBy(xpath = configuration.RemoveAccountYes)
	public WebElement RemoveAccountYes;
	
	
	
	public void GmailSignout() throws InterruptedException{
		LogobtnClick.click();
		Thread.sleep(2000);
		signOutClick.click();
		RemoveanAccount.click();
		Removeemail.click();
		Thread.sleep(2000);
		RemoveAccountYes.click();
		System.out.println("Gmail Account Sucessfully signout....!");
		
	}
	
	
	
	
}
