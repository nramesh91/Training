package sample.testng;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleA extends SampleReusableClass {
	
	@BeforeMethod
	public void openBrowser(){
		init();
	}
	
	@AfterMethod
	public void closeBrowser(){
		destroy();
	}
	
	@Test
	public void test() throws IOException
	{
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getCurrentUrl());
		getScreenshot();
	}

}
