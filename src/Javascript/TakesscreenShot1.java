package Javascript;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesscreenShot1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		TakesScreenshot ts=(TakesScreenshot) driver;
		File Ram = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./photo/flipkart.jpg");
		FileUtils.copyFile(Ram, dest);
		driver.close();
	



}
}