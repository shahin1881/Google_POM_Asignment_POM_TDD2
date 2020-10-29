package com.qa.GmailPages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_12_Page extends testCore {

	WebDriver driver;

	public Google_12_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	
	
	/*@FindBy(xpath = configuration.TotalEmail)
	public WebElement TotalEmail;*/
	
	
	@FindBy(xpath = configuration.UnreadEmail)
	public WebElement UnreadEmail;

	@FindBy(xpath = configuration.ReadEmailCount)
	public WebElement ReadEmailCount;
	
	
	
	
	// 2.using Page Object Pattern option 2
		public  void CountUnreadEmailInbox() {
			app_logs.debug("Verify the unreademailInbox");
			 boolean unreademail=UnreadEmail.isEnabled();
			 Assert.assertTrue(unreademail);
			 System.out.println("verify unreademail email box is Enabled");
			
			 
			 
			 List<WebElement> CountUnreadEmailInbox = driver.findElements(By.xpath("//tr[@class='zA zE']"));//48
			 System.out.println("Total No. of unread Mails: " +CountUnreadEmailInbox.size() );
			 
			//System.out.println(UnreadEmail.getSize());
			
			 
		}
		
		
		public List<WebElement> ReadEmailInbox(){
			app_logs.debug("Verify the ReademailInbox");
			ReadEmailCount.isEnabled();
			 
			 List<WebElement> ReadEmailCount = driver.findElements(By.xpath("//tr[@class='zA yO']"));//48
			 System.out.println("Total No. of read Mails: " +ReadEmailCount.size() );
			 return ReadEmailCount;
		}
	}


