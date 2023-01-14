package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectOrSingle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd = driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for(WebElement w:options)
		{
			System.out.println(w.getText());
			
		}
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("not multiselect");
			driver.close();
		}
		//driver.close();
		
		
	}

}
