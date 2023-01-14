package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class NotificationFirefox {
	public static void main(String[] args) {
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("--disable notifications");
		System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
	//	WebDriver driver=new GeckoDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.mi.com/in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

}
