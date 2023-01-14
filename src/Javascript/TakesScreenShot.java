package Javascript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//TakesScreenShot ts=(TakesScreenShot) driver;
	TakesScreenshot ts=(TakesScreenshot) driver;
	File RAM = ts.getScreenshotAs(OutputType.FILE);
	 File DEST = new File("./photo/amazon.png");
	// Files.copy(RAM, DEST);
	 FileUtils.copyFile(RAM, DEST);
		
		
		
	}

}
