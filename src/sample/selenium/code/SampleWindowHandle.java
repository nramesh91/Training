package sample.selenium.code;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SampleWindowHandle {
	static WebDriver driver;
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rnapa\\workspace\\JAR\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		
		// To get the main window handle
		String windowTitle= getCurrentWindowTitle();
		System.out.println(windowTitle);
		String mainWindow = getMainWindowHandle(driver);
		System.out.println(mainWindow);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
		driver.quit();
	}
	
	public static String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public static String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			System.out.println(currentWindowHandle);
			if (!currentWindowHandle.equals(openWindowHandle)) {
				System.out.println(openWindowHandle);
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
	
}
