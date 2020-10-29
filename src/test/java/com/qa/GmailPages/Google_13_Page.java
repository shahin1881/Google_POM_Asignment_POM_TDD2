package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_13_Page extends testCore {
	WebDriver driver;

	public Google_13_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
   }
	
	
	@FindBy(xpath = configuration.Composebtn)
	public WebElement Composebutton;
	
	@FindBy(xpath = configuration.Compose)
	public WebElement Compose;
	
	
	
	// 2.using Page Object Pattern option 2
			public  void ClickCompose() throws InterruptedException {
				app_logs.debug("Verify the unreademailInbox");
				 boolean Compose=Composebutton.isEnabled();
				 Assert.assertTrue(Compose);
				 System.out.println("verify Composebutton email box is Enabled");
				 Thread.sleep(3000);
				 Composebutton.click();
				 Thread.sleep(2000);
				
				//switch to current window 
		    String winHandleBefore = driver.getWindowHandle();

				 
				 
		}
			
			  public boolean checkComposebody() throws InterruptedException{
				Thread.sleep(2000);
				System.out.println("Dialog Box prasent");
				return Compose.isEnabled();
	}
}
