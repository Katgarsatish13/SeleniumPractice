package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.switchTo().newWindow(WindowType.TAB);
		 Thread.sleep(2000);
		 driver.get("https://www.amazon.in/");
		 String parent= driver.getWindowHandle();
		 Thread.sleep(2000);
		 System.out.println(parent);
		 Thread.sleep(2000);
		 Set<String> child = driver.getWindowHandles();
		 System.out.println(child);
		 Thread.sleep(2000);
		 //close only child browser 
		// driver.close();
		 //close both browser parent and child
		 driver.quit();
}
}