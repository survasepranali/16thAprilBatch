package com.saucedemo.testClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pomClass.LogoutPomClass;
import com.saucedemo.pomClass.LoginPomClass;
import com.saucedemo.utilityClass.Screenshots;

public class TC002_VerifyLogoutFunctaionality extends TestBaseClass
{
	@Test
	public  void logoutfunctaionality () throws IOException
	{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	 WebDriver driver = new ChromeDriver();
//	 driver.get("https://www.google.com/");
//	 System.out.println("Browser is open");
//	 driver.get(("https://www.saucedemo.com/"));
//	 System.out.println("URL is open");
//	 driver.manage().window().maximize();
//	 System.out.println("Browser gets maximize");
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	 System.out.println("Applying the waits");
//	 
//	 LoginPomClass lpc = new  LoginPomClass (driver);
//	 lpc.sendusername();
//	 System.out.println("Enter the Username");
//	 lpc.sendpassword();
//	 System.out.println("Enter the Password");
//	 lpc.Clickonlogin();
//	 System.out.println("Click the Login");
//	 Screenshots.takescreenshot(driver);

	 LogoutPomClass hpc = new LogoutPomClass (driver);
	 hpc.clickonsettingbutton();
	 log.info("Click the setting");
	 hpc.clickonlogoutbutton();
	 log.info("Click the logout");
	 Screenshots.takescreenshot(driver);
	 //validation of login page
	 
	     String expectedTitle = "Swag Labs";
		String actualTitle = "Swag Labs";
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("Test case is pass");
//		}
//		else
//		{
//			System.out.println("Test case is fail");
//		}
//		driver.close();
//		System.out.println("Browser is closed");
		
//		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle,"Titles are not matching");
		
	 
			 
}
}