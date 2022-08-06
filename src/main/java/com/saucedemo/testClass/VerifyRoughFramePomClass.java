package com.saucedemo.testClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pomClass.RoughFramePomClass;
import com.saucedemo.utilityClass.Screenshots;

public class VerifyRoughFramePomClass
{
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 System.out.println("Browser is open");
	 driver.get(("https://www.saucedemo.com/"));
	 System.out.println("URL is open");
	 driver.manage().window().maximize();
	 System.out.println("Browser gets maximize");
	 Screenshots.takescreenshot(driver);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 System.out.println("Applying the waits");
	 
	 RoughFramePomClass rfpc = new RoughFramePomClass (driver);
	 WebElement frameEle = rfpc.getElement();
	 driver.switchTo().frame(frameEle);
	 Screenshots.takescreenshot(driver);
}
}
