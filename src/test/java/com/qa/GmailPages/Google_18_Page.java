package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_18_Page extends testCore {

	WebDriver driver;

	public Google_18_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = configuration.Createnewlabelbtn)
	public WebElement Createnewlabelbtn;

	@FindBy(xpath = configuration.PleaseEnterNewLabel)
	public WebElement PleaseEnterNewLabel;

	@FindBy(xpath = configuration.Createbtn)
	public WebElement Createbtn;

	@FindBy(xpath = configuration.Testing)
	public WebElement Testing;

	@FindBy(xpath = configuration.Testingdtbtn)
	public WebElement Testingdtbtn;

	@FindBy(xpath = configuration.Removelabel)
	public WebElement Removelabel;

	@FindBy(xpath = configuration.Deletelabel)
	public WebElement Deletelabelbtn;

	
	
	


	public void VerifyCreateLabelLink() throws InterruptedException {
		Thread.sleep(5000);
		Createnewlabelbtn.click();
		PleaseEnterNewLabel.sendKeys("Testing");
		Thread.sleep(2000);
		Createbtn.click();
		Thread.sleep(3000);
		
		 boolean Testinglabel=Testing.isEnabled();
		 Assert.assertTrue(Testinglabel);
		 System.out.println("verify Testinglabel successfully created");
		 Thread.sleep(2000);
		 Testingdtbtn.click();
		 Thread.sleep(1000);
		 Removelabel.click();
		 Thread.sleep(3000);
		 Deletelabelbtn.click();
		 System.out.println("Testing label Successfully Deleted");
		 //Thread.sleep(3000);
		// driver.navigate().back();
		 
		
	}
	
	
	
}
