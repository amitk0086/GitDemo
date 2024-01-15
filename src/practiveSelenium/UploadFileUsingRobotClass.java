package practiveSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			
			driver.get("https://easyupload.io/");
			driver.findElement(By.className("dz-button")).click();
			
			Robot robot = new Robot();
			
			StringSelection filepath = new StringSelection("D:\\Personal\\Resume\\Amit_Kumar_Jaiswal_Automation_Tester_6Years.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
