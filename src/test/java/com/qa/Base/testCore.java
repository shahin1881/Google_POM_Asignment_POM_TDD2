package com.qa.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.qa.Config.configuration;
import com.qa.Util.ExcelReader;
import com.qa.Util.TestConfig;
import com.qa.Util.monitoringMail;
import com.qa.Util.testUtil;

public class testCore {
	public static WebDriver driver=null;
	public static ExcelReader excel=null;
   public static Logger app_logs=Logger.getLogger("devpinoyLogger");
	
	@BeforeSuite
	public void init() throws IOException{
		if(driver==null){
			
			if((configuration.browser).equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\Chrome_Dwoaload\\chromedriver.exe");
			    driver=new ChromeDriver(); 
			
			app_logs.debug("Launching chrome Browser");
		         
	     }else if((configuration.browser).equalsIgnoreCase("ie")){
			
		    System.setProperty("webdriver.ie.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			
		    app_logs.debug("Launching ie browser");
			
		 }else if((configuration.browser).equalsIgnoreCase("firefox")){
			
			
			System.setProperty("webdriver.gecko.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		   app_logs.debug("Launching chrome browser");
			
		
		}
		}
	driver.get(configuration.testsite);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	app_logs.debug("Opening faceBook login page");
	driver.manage().timeouts().implicitlyWait(150L, TimeUnit.SECONDS);

	}
	
@AfterSuite
public void QuitDriver() throws MessagingException {
 
// if (driver!=null)
	/*app_logs.debug("Sending Mail");
	
	  testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
	  monitoringMail mail = new monitoringMail();
	  try{
		  mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
			
		} catch(AddressException e){
			// TODO Auto-generated catch block
			 e.printStackTrace();
		 }
	  System.out.println("Sending Mail Successfully.......");*/
	
    //driver.close();
}
}


