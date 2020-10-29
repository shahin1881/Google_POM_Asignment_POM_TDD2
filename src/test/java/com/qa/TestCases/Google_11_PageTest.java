package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.Google_11_Page;
import com.qa.Util.testUtil;



public class Google_11_PageTest extends TestBase{
	 @BeforeTest
		public void isSkip()
		{
			if(!testUtil.isExecutable("Google_11_PageTes")){
				throw new SkipException("Skipping the testcase as runmode is set to No");
			}
		}
	 
	 
	 @Test(dataProvider="getData")
     public void doLogin(String email,String password) throws IOException {
     try{
   	 //app_logs.debug("Executing login Test");
     Google_11_Page gp=new Google_11_Page(driver);
   	  Thread.sleep(3000L);
   	  gp.email().sendKeys(email);
   	  gp.nextbtn1().click();
   	   Thread.sleep(3000);
   	 	gp.password().sendKeys(password);
   	 	gp.nextbtn2().click();
     }catch(Throwable t){
   	   testUtil.captureScreenshot("Google_11_PageTest");
   	   Assert.assertTrue(false,t.getMessage());
   	 	
     }
}	  
   	  
         //Reading data from the Excel File
       @DataProvider
       public Object[][] getData(){
       	
       	return testUtil.getData("LoginTest");
       
       }
       
	
		}
		
		    
	

