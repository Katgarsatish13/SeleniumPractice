package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Robot robort=new Robot();
		robort.keyPress(KeyEvent.VK_CONTROL);
	robort.keyPress(KeyEvent.VK_P);
		Thread.sleep(3000);
		//robort.keyPress(KeyEvent.VK_TAB);
	//	robort.keyPress(KeyEvent.VK_CANCEL);
		Thread.sleep(3000);
		robort.keyRelease(KeyEvent.VK_P);
		robort.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
	}

}
