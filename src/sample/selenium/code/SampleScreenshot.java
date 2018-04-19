package sample.selenium.code;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleScreenshot {
	static WebDriver driver;
	public static void main(String args[]) throws IOException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rnapa\\workspace\\JAR\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		Date date = new Date();
		if (title.equals("Google")){
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(file, new File("C:\\Users\\rnapa\\workspace\\Training\\Screenshots\\" + "Google.jpg"));
			FileUtils.copyFile(file, new File("C:\\Users\\rnapa\\workspace\\Training\\Screenshots\\" + date.getTime() +".jpg"));
		driver.quit();
		}
	}

}
