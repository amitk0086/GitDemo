package practiveSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jkami/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		Thread.sleep(1000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)")	;	
		Thread.sleep(1000);
		
		List<WebElement> droplist= driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		for(WebElement list:droplist)
		{
			if(list.getText().equals("Action"))
			{
				list.click();
				break;
			}
		}
		
	
	}

}
