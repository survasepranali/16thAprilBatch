package com.saucedemo.utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots 
{
public static void takescreenshot (WebDriver driver) throws IOException
{

Date d = new Date ();
DateFormat d1 = new SimpleDateFormat ("MM-dd-yy & HH-mm-ss"); 
String date = d1.format(d);
//Take Screenshots

TakesScreenshot ts =  (TakesScreenshot) driver;
File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
File destfile = new File ("C:\\Users\\ADMIN\\Desktop\\SOFTWARE TESTING\\AUTOMATION\\SELENIUM\\SCREENSHOT\\saucedemo\\"+date+"image.jpg");
FileHandler.copy(Sourcefile, destfile);
System.out.println("login screenshot is taken");

//Date d = new Date ();
//DateFormat d1 = new SimpleDateFormat (“MM-dd-yy  && HH-mm-ss”);
//String date = d1.format(d);

}
}
