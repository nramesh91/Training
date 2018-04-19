package sample.testng;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleParallelMethods extends SampleReusableClass {
	@BeforeMethod
	public void openBrowser(){
		init();
	}
	
	@AfterMethod
	public void closeBrowser(){
		destroy();
	}
	
	@Test
	public void test1() throws IOException{
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getCurrentUrl());
		getScreenshot();
	}
	
	@Test
	public void test2() throws IOException
	{
		driver.get("http://testng.org/doc/documentation-main.html");
		System.out.println(driver.getCurrentUrl());
		getScreenshot();
	}
	
	@Test
	public void test3() throws IOException
	{
		driver.get("https://maven.apache.org/");
		System.out.println(driver.getCurrentUrl());
		getScreenshot();
	}

}
