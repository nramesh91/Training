package sample.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class SampleExtentReports {
	ExtentReports report;
	WebDriver driver;
	
	@BeforeTest
	public void testExtent(){
		report = ExtentReports.get(SampleExtentReports.class); 
		report.init("C:\\Users\\rnapa\\workspace\\Training\\Reports\\Test.html", true);
	}
	
	@BeforeMethod
	public void init(){
		report.startTest("Verify page title");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rnapa\\workspace\\JAR\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		report.log(LogStatus.INFO, "Browser started");
	}
	
	@Test
	public void testGMail(){
		driver.get("https://accounts.google.com");
		report.log(LogStatus.INFO, "Navigated to https://accounts.google.com");
		String title = "1Sign - Google Accounts";
//		Assert.assertEquals("Sign in - Google Accounts", driver.getTitle());
//		Assert.assertTrue(title.equals(driver.getTitle()), "message: Title is not matched");
		if (title.equalsIgnoreCase(driver.getTitle()))
			report.log(LogStatus.PASS, "Title verified");
		else
			report.log(LogStatus.FAIL, "Title not verified");
	}
	
	@Test
	public void testSeleniumHQ() throws InterruptedException{
		driver.get("https://www.seleniumhq.org");
		report.log(LogStatus.INFO, "Navigated to https://www.seleniumhq.org");
		Assert.assertEquals("Selenium - Web Browser Automation", driver.getTitle());
		report.log(LogStatus.PASS, "Title verified");
	}
	
	@Test
	public void testTestNG(){
		driver.get("http://testng.org/doc");
		report.log(LogStatus.INFO, "Navigated to http://testng.org/doc");
		Assert.assertEquals("TestNG - Welcome", driver.getTitle());
		report.log(LogStatus.PASS, "Title verified");
	}

	@AfterMethod
	public void destroy(){
		driver.quit();
		report.log(LogStatus.INFO, "Browser closed");
	}
	
	@AfterTest
	public void closeExtent(){
		report.endTest();
	}
}
