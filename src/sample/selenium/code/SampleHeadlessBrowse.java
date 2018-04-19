package sample.selenium.code;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class SampleHeadlessBrowse {
	public static WebDriver driver;
	public static void main(String args[]){
		driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		Assert.assertEquals("Selenium - Web Browser Automation", driver.getTitle());
		System.out.println("TRUE");
	}

}
