package sample.selenium.code;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleWebTable {
	WebDriver driver;
	@BeforeMethod
	public void initilize(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/rnapa/workspace/JAR/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void destroy(){
		driver.quit();
	}	
	
	
	@Test
	public void testReadWebTable() throws InterruptedException, IOException{
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumlearn.com/table");
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
        Date date = new Date();
        String time=dateFormat.format(date);
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Users\\rnapa\\workspace\\Screenshots\\" + time + ".png"));
		List <WebElement> rows = driver.findElements(By.xpath("//div[@id='content']/div[2]/article/div/div/div/div/table/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());
		List <WebElement> cols = driver.findElements(By.xpath("//div[@id='content']/div[2]/article/div/div/div/div/table/tbody/tr[1]/th"));
		System.out.println("Number of rows: " + cols.size());
		int k = 1;
		while(k <= cols.size()){
			String data = driver.findElement(By.xpath("//div[@id='content']/div[2]/article/div/div/div/div/table/tbody/tr[1]/th["+k+"]")).getText();
			if (data.equals("Designation")){
				System.out.println(data);
				int col = k;
				String req_data = driver.findElement(By.xpath("//div[@id='content']/div[2]/article/div/div/div/div/table/tbody/tr[2]/td["+col+"]")).getText();
				System.out.println(req_data);
				break;
			}
			k++;
		}
		/*System.out.println();
		for (int i = 2; i <= rows.size(); i++){
			List <WebElement> cols_D = driver.findElements(By.xpath("//div[@id='content']/div[2]/article/div/div/div/div/table/tbody/tr["+i+"]/td"));
//			System.out.println(cols_D.size());
			for (int j = 1; j <= cols_D.size(); j++){
				String data = driver.findElement(By.xpath("//div[@id='content']/div[2]/article/div/div/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
	}
}
