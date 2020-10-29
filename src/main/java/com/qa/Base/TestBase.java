package com.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.qa.Util.WebEventListener;



import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestBase {

	public static WebDriver driver;
	public static EventFiringWebDriver eventFiringWebDriver;
	public static WebEventListener webEventListener;
//	public Logger log = Logger.getLogger("Google assignment");
	private static final String ResultSet = null;

	  public static Properties config;
	

	public TestBase() {
		 config = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("D:\\MAVEN2\\MVN_PROJECT\\Google_POM_Assignment_TDD\\src\\main\\java\\com\\qa\\Config\\config.properties");
			config.load(ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static void inti() throws IOException { 
		String browsername = config.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\Chrome_Dwoaload\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JARs\\chromeSelinium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;

		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	public static void inti1() throws IOException { 
		String browsername = config.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\Chrome_Dwoaload\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\JARs\\chromeSelinium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;

		driver.get(config.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
		
		
		
		