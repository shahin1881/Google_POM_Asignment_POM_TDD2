package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;
import com.qa.Config.configuration;

public class Google_11_Page extends TestBase {

	
		 WebDriver driver;

	public Google_11_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// 1.using Page Object Factory
	@FindBy(xpath = configuration.Gmail) // xpath of usenname
	public WebElement Gmail;
	
	
	@FindBy(xpath = configuration.username) // xpath of usenname
	public WebElement username;

	@FindBy(xpath = configuration.next1) // xpath of login
	public WebElement nextbtn1;

	@FindBy(xpath = configuration.password) // xpath of password
	public WebElement password;

	@FindBy(xpath = configuration.next2) // xpath of login
	public WebElement nextbtn2;

	
	
	
	// 2.using Page Object Pattern option 2
	public WebElement Gmail() {

		// app_logs.debug("Executing ProfileTest");
		return Gmail;
	}
	public WebElement email() {
	// app_logs.debug("Entering the Username");
		
		return username;
	}

	public WebElement nextbtn1() {

		// app_logs.debug("Executing ProfileTest");
		return nextbtn1;
	}

	public WebElement password() {

		// app_logs.debug("Entering the Password");
		return password;
	}

	public WebElement nextbtn2() {

		// app_logs.debug("Executing ProfileTest");
		return nextbtn2;
	}

}
