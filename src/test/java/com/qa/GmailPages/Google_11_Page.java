package com.qa.GmailPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;

public class Google_11_Page extends testCore {

	WebDriver driver;

	public Google_11_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//current instance method and veriable ca

	}

	// 1.using Page Object Factory
	@FindBy(xpath = configuration.signin)
	public WebElement signin;

	@FindBy(xpath = configuration.username) // xpath of username
	public WebElement username;

	@FindBy(xpath = configuration.next1)
	public WebElement nextbtn1;

	@FindBy(xpath = configuration.password)
	public WebElement Password;

	@FindBy(xpath = configuration.next2)
	public WebElement nextbtn2;

	
	@FindBy(xpath = configuration.Gmail1)
	public WebElement gmail;
	
	/*@FindBy(xpath = configuration.GoogleApps)
	public WebElement GoogleApps;

	@FindBy(xpath = configuration.Gmail)
	public WebElement gmail;*/

	@FindBy(xpath = configuration.Starred)
	public WebElement Starred;

	@FindBy(xpath = configuration.TotalNoEmailStarred)
	public WebElement totalemail;

	
	
	
	
	
	// 2.using Page Object Pattern option 2
	
	
	
	public void signin() throws InterruptedException{
		Thread.sleep(2000);
		signin.click();
		
		}

	
	public void  signin1() throws InterruptedException {
		/*Thread.sleep(2000);
		signin.click();
		username.sendKeys("");
		nextbtn1.click();
		Thread.sleep(5000);
		Password.sendKeys("");
		nextbtn2.click();*/
		
		/*GoogleApps.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		*/
		gmail.click();
		
		
	}
	
	public void clickStarred() throws InterruptedException
	{ 
		 boolean stareed=Starred.isEnabled();
		 Assert.assertTrue(stareed);
		 System.out.println("verify staared button is Enabled");
		 Thread.sleep(3000);
		 Starred.click();
		 Thread.sleep(4000);
		 String str=totalemail.getText();
		// System.out.println( str);
		 System.out.println("Total Starred Emails are : " + str );
		 
		 Thread.sleep(2000);
			driver.navigate().back();
		
     }

	public WebElement username() {
		
		return username;
	}
	
	public WebElement nextbtn1() {
		return nextbtn1;
		
		
	}

	public WebElement password() {
		
		return Password;
	}

	

	public WebElement nextbtn2() {
		return nextbtn2;
		
		
	}



	



	


	
	
	

	
}
