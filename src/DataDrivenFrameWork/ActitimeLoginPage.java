package DataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginPage {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		flib f=new flib();
//		String username = f.readExceldata("data/testdata.xlsx", "validdata", 1,1);
//		driver.findElement(By.id("username")).sendKeys(username);
//		Thread.sleep(3000);
//		String password = f.readExceldata("data/testdata.xlsx", "validdata",2, 1);
//		driver.findElement(By.name("pwd")).sendKeys(password);
		int rc = f.getRowCountMethod("./data/testdata.xlsx","invalid");
		for(int i=1;i<=rc;i++)
		{
			String invalidusername = f.readExceldata("./data/testdata.xlsx","invaliddata",i,0);
			driver.findElement(By.id("username")).sendKeys(invalidusername);
			Thread.sleep(3000);
			String invalidpassword = f.readExceldata("./data/testdata.xlsx","invaliddata",i,1);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("username")).clear();
		}
		
	}

}
