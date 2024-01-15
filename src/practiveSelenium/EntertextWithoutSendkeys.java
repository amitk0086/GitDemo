package practiveSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntertextWithoutSendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/login");
			driver.findElement(By.id("Email")).clear();
			Thread.sleep(1000);
			
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript ("document.getElementById('Email').value='Selenium'");
			
			
			
	}

}
