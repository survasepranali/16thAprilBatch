package com.saucedemo.testClass;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.pomClass.LoginPomClass;
import com.saucedemo.utilityClass.Screenshots;

public class TestBaseClass 
{
	WebDriver driver;
	Logger log;
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
        {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
         }
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("throw the error");
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		 log = Logger.getLogger("SauceDemo_Project");
		PropertyConfigurator.configure("log4j.properties");
		 driver.get("https://www.google.com/");
		 log.info("Browser is open");
		 driver.get(("https://www.saucedemo.com/"));
		 System.out.println("URL is open");
		 log.info("URL open");
		 driver.manage().window().maximize();
		 log.info("Browser gets maximize");
		 Screenshots.takescreenshot(driver);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 log.info("Applying the waits");
		 
		 //LOGIN
		 
		 LoginPomClass lpc = new  LoginPomClass (driver);
		 lpc.sendusername();
		 log.info("pass the username");
		 lpc.sendpassword();
		 log.info("pass the password");
		lpc.Clickonlogin();
		log.info("click the login");
		 Screenshots.takescreenshot(driver);
	} 
		
		 @AfterMethod
	
		 public void teardownMethod ()
			{
			    driver.close();
				System.out.println("browser is closed");
			}
			
			
	}


