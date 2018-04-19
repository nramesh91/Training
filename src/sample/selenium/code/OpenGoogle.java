package sample.selenium.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
	WebDriver driver;
	
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/rnapa/workspace/JAR/geckodriver.exe");
		driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "C:/Users/rnapa/workspace/JAR/chromedriver.exe");
//		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Page title is " + driver.getTitle());
		driver.quit();
	}

}
