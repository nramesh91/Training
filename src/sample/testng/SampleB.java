package sample.testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleB extends SampleReusableClass {
	
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
		driver.get("http://testng.org/doc/documentation-main.html");
		System.out.println(driver.getCurrentUrl());
		getScreenshot();
	}

}
