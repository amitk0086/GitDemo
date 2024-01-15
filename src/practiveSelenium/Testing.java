package practiveSelenium;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:/Users/jkami/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
	}

}
