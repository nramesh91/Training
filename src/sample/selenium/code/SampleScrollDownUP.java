package sample.selenium.code;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleScrollDownUP {
	WebDriver driver;
	@BeforeMethod
	public void init(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/rnapa/workspace/JAR/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void destroy(){
		driver.quit();
	}
	
	@Test (priority=1)// Scroll down
	public void ScrollDown() throws Exception {
	    driver.get("http://www.seleniumlearn.com/selenium");
//	    driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("scroll(0, 900)"); // Y value is scroll down
	    Thread.sleep(5000); 
	    jse.executeScript("scroll(900, 0)"); // X value is scroll up
	    Thread.sleep(5000);        
	}

	/*@Test (priority=2)// Scroll up
	public void ScrollUP() throws Exception {
		  driver.get("http://www.seleniumlearn.com/selenium");
//		  driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("scroll(900, 0)"); // Y value is scroll down
	}*/

}
