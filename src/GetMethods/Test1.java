package GetMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//enter the url and wait till page will be loaded
		driver.get("https://www.facebook.com");
		//get the url of the application
		System.out.println(driver.getCurrentUrl());
		//get current application title
		
		System.out.println(driver.getTitle());
	
		//close the application
		driver.close();
		
		
	}

}
