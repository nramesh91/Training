package sample.selenium.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {
	public static void main(String args[]){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rnapa\\workspace\\JAR\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		String win1 = driver.getWindowHandle();
		System.out.println("Name: " + win1);
		driver.quit();
	}

}
