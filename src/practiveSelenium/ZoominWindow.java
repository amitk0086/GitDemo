package practiveSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominWindow {
	

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("document.body.style.zoom='1.5'");
			//driver.close();

	}

}
