package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_19_Page extends testCore{
	
	
	WebDriver driver;

	public Google_19_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = configuration.Selectemailbox)
	public WebElement Selectemailbox;

	@FindBy(xpath = configuration.Clickegcheckbox)
	public WebElement Clickegcheckbox;

	@FindBy(xpath = configuration.MovetoIcon)
	public WebElement MovetoIcon;

	@FindBy(xpath = configuration.label1)
	public WebElement label1;

	@FindBy(xpath = configuration.labelbtn)
	public WebElement labelbtn;

	
	@FindBy(xpath = configuration.Verifylabelmail)
	public WebElement Verifylabelmail;
	
	/*@FindBy(xpath = configuration.Selectlabelmail)
	public WebElement Selectlabelmail;

	@FindBy(xpath = configuration.Clickegcheckbox1)
	public WebElement Clickegcheckbox1;

	@FindBy(xpath = configuration.Moveto)
	public WebElement Moveto;

	@FindBy(xpath = configuration.label2)
	public WebElement label2;

	@FindBy(xpath = configuration.Clickbtnlabel2)
	public WebElement Clickbtnlabel2;

	@FindBy(xpath = configuration.Verifylabelbox2)
	public WebElement Verifylabelbox2;
*/
	
	public void EmailMovetoLabel() throws InterruptedException{
	     Thread.sleep(3000);
		 boolean Selectemailboxs=Selectemailbox.isEnabled();
		 Assert.assertTrue(Selectemailboxs);
		 System.out.println("verify Selectemailbox is present");
		// Thread.sleep(2000);
		 Clickegcheckbox.click();
		 Thread.sleep(1000);
		 
		 MovetoIcon.click();
		 Thread.sleep(2000);
		 label1.click();
		 System.out.println("Email moveto sucessfully label1...!");
		 Thread.sleep(5000);
		 boolean labelbtns=labelbtn.isEnabled();
		 Assert.assertTrue(labelbtns);
		 System.out.println("verify label1 is present");
		 labelbtn.click();
		 
		//Thread.sleep(5000);
		 boolean Verifylabelmail1=Verifylabelmail.isEnabled();
		 Assert.assertTrue(Verifylabelmail1);
		 System.out.println("verify label1 mail receivable ");
		 
		 
		 
		/* labelbtn.click();
		 boolean Selectlabelmail1=Selectlabelmail.isEnabled();
		 Assert.assertTrue(Selectlabelmail1);
		 System.out.println("verify Selectlabelmail is present");
		 Thread.sleep(2000);
		 Clickegcheckbox1.click();
		 Moveto.click();
		 Thread.sleep(2000);
		 label2.click();
		 System.out.println("Email moveto sucessfully label2...!");
		 Clickbtnlabel2.click();
		 boolean Verifylabelbox2s=Verifylabelbox2.isEnabled();
		 Assert.assertTrue(Verifylabelbox2s);
		 System.out.println("verify Verifylabelbox2 is present");
		 Thread.sleep(2000);
		 driver.navigate().back();*/
	}
	
	
	
	

}
