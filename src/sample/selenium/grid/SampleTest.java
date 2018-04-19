package sample.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SampleTest {
	WebDriver driver;
	@Test
	public void test1() throws MalformedURLException{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.seleniumhq.org/");
		System.out.println("Title is " + driver.getTitle());
		driver.quit();
	}
}
