package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectOrMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement DropDown = driver.findElement(By.id("gh-cat"));
		Select sel=new Select(DropDown);
		List<WebElement> option = sel.getOptions();
		System.out.println(option.size());
		for(WebElement b:option)
		{
			System.out.println(b.getText());
		}
			sel.selectByIndex(3);
			sel.selectByValue("2984");
			sel.selectByVisibleText("Collectibles");
			if(sel.isMultiple())
			{
				sel.deselectAll();
			}
			else
			{
				System.out.println("null select");
			}
			driver.close();
		

}
}