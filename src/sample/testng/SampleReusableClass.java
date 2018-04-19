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

public class SampleReusableClass {
	
	WebDriver driver;
	
	public void init(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/rnapa/workspace/JAR/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser opened");
	}
	
	public void destroy(){
		driver.quit();
		System.out.println("Browser closed");
	}
	
	public void getScreenshot() throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,  new File("C:\\Users\\rnapa\\workspace\\Screenshots\\2018_Mar_01\\"+time+".png"));
		System.out.println("Screenshot has taken");
	}

}
