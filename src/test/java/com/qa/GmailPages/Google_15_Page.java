package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_15_Page extends testCore{

	WebDriver driver;

	   public Google_15_Page(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		
	   
	   
	   @FindBy(xpath = configuration.Search)
		public WebElement SearchMail;

		@FindBy(xpath = configuration.Searchbtn)
		public WebElement Searchbtnicon;

		
		@FindBy(xpath = configuration.SearchInbox)
		public WebElement SearchInbox;

	
     public void VerifySearchMailbox() throws InterruptedException{
    	 Thread.sleep(3000);
    	 boolean SearchMail1=SearchMail.isEnabled();
 		 Assert.assertTrue(SearchMail1);
 		 System.out.println("verify SearchMailbox is paresent");
 		 Thread.sleep(2000);
    	 SearchMail.sendKeys("shahinsayyed66@gmail.com");
    	 
     }

    
     
      public void VerifySearchbtnicon() throws InterruptedException{
    	  boolean Searchbtnicon1=Searchbtnicon.isEnabled();
  		  Assert.assertTrue(Searchbtnicon1);
  		  System.out.println("verify Searchbtnicon is paresent");
  		  Thread.sleep(2000);
    	  Searchbtnicon.click();
    	 
     }
      
      
      public void VerifySearchInbox() throws InterruptedException{
    	  Thread.sleep(5000);
    	  boolean SearchInboxemails=SearchInbox.isEnabled();
  		  Assert.assertTrue(SearchInboxemails);
  		  System.out.println("verify SearchInboxemail Same Name is paresent");
          Thread.sleep(20000);
          driver.navigate().back();
      
      }
}



