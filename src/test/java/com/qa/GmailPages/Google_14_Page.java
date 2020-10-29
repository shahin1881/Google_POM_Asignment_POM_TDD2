package com.qa.GmailPages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Base.testCore;
import com.qa.Config.configuration;


public class Google_14_Page extends testCore {
	WebDriver driver;

   public Google_14_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = configuration.To)
	public WebElement To;

	@FindBy(xpath = configuration.Subject)
	public WebElement Subject;

	@FindBy(xpath = configuration.MsgBox)
	  public WebElement MsgBox1;
   
	
	@FindBy(xpath = configuration.Send)
	public WebElement Sendbutton;

	@FindBy(xpath = configuration.Sentbtn)
	public WebElement Sentbox;
	
	@FindBy(xpath = configuration.Sentinbox)
	public WebElement sentinboxemail;
	
	
	
	
	
	
	public void sendmailTo() throws InterruptedException {
         Thread.sleep(5000);
		
		 To.sendKeys("shahinsayyed66@gmail.com");
		 boolean sendmailTo=To.isEnabled();
		 Assert.assertTrue(sendmailTo);
		 System.out.println("verify To is Enabled");
	}

	public void sendmailsubject() throws InterruptedException {
		
		Subject.sendKeys("Shahinsayyed-> Test email");
		 Thread.sleep(2000);
		 boolean sendmailsubject=Subject.isEnabled();
		 Assert.assertTrue(sendmailsubject);
		 System.out.println("verify sendmailsubject is Enabled");
	}

	public void SendMsgBox() throws InterruptedException {
		Thread.sleep(5000);
		MsgBox1.click();
		MsgBox1.sendKeys("Hi Miss");
	}

	public void sendmailsendbttan() throws InterruptedException {
		Thread.sleep(5000);
		 boolean sendmailsendbttan=Sendbutton.isEnabled();
		 Assert.assertTrue(sendmailsendbttan);
		 System.out.println("verify sendmailsend button is Enabled");
		 Thread.sleep(3000);
		 Sendbutton.click();
		 System.out.println("mail successfully sending in user");
		 
		 /*String parent = driver.getWindowHandle();
		  driver.switchTo().window(parent);
		  Thread.sleep(3000);
		  System.out.println("parent window switch");*/
		 
		 
		  /* Set<String>ids=driver.getWindowHandles();
			Iterator<String>iterate=ids.iterator();
			
			String parentid=iterate.next();//interface
			//String childid=iterate.next();
		 
			driver.switchTo().window(parentid);*/
		 
		 
		 //String parent=driver.getWindowHandle();
		 
		 
		 /*driver.switchTo().defaultContent();
		 String winHandleBefore = null;
		 driver.switchTo().window(winHandleBefore);
		 */
	}

	public void Sentemailbox() throws InterruptedException{
	    Thread.sleep(5000);
		Sentbox.click();
		Thread.sleep(3000);
		System.out.println("Click on Send email inbox");
		boolean sendemailbox=Sentbox.isEnabled();
		Assert.assertTrue(sendemailbox);
		System.out.println("verify Sentemailbox button is Enabled");
		
		
	}


     public void verifySentinbixemail() throws InterruptedException{
    	 Thread.sleep(5000);
    	 boolean sendmail=sentinboxemail.isEnabled();
		 Assert.assertTrue(sendmail);
		 System.out.println("Email sending in user sucessfully");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
     }




}