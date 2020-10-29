package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_16_Page extends testCore {

	WebDriver driver;

	public Google_16_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = configuration.Searchoptionbtn)
	public WebElement Searchoptionbtn;

	@FindBy(xpath = configuration.AllMail)
	public WebElement AllMail;

	@FindBy(xpath = configuration.Inbox)
	public WebElement Inbox;

	@FindBy(xpath = configuration.HasAttechment)
	public WebElement HasAttechment;

	@FindBy(xpath = configuration.Searchbtn1)
	public WebElement Searchbtn1;

	@FindBy(xpath = configuration.countNoTotalAttachmt)
	public WebElement countNoTotalAttachmt;

	/*@FindBy(xpath = configuration.Inboxmail)
	public WebElement Inboxmail;
*/
	
	
	public void ClickOnSearchOptionbtn() throws InterruptedException{
		Thread.sleep(2000);
		Searchoptionbtn.click();
		
	}
	
	
	public void clickOnAllmailbox() throws InterruptedException{
		Thread.sleep(1000);
		AllMail.click();
	}
	
	public void SelectInboxIndex() throws InterruptedException{
		Thread.sleep(1000);
		Inbox.click();
	}
	
	
	public void ClickOnCheckBox() throws InterruptedException{
		Thread.sleep(2000);
		HasAttechment.click();
	}
	
	public void clickOnSearchbtn1(){
		Searchbtn1.click();
		System.out.println("click on searchbtn");
	}
	
	public void countNoTotalAttachmt() throws InterruptedException{
		 Thread.sleep(3000);
		 boolean countNoTotalAttachmt1=countNoTotalAttachmt.isEnabled();
 		 Assert.assertTrue(countNoTotalAttachmt1);
 		 System.out.println("verify oTotalAttachmt Email Inbox is paresent");
 		 Thread.sleep(5000);
 		 String str=countNoTotalAttachmt.getText();
 		// System.out.println( str);
 		 System.out.println("countNoTotalAttachmt Emails Inbox are : " + str );
	    Thread.sleep(2000);
	   driver.navigate().back();
	}
	
	/*public void ClickOnInboxMail(){
		
	}*/
}
