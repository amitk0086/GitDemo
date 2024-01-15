package com.parametrized;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://admin-demo.nopcommerce.com/login");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
	@Test(dataProvider="LoginData")
	public void loginTest(String username,String pwd, String value) throws InterruptedException
	{
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		Thread.sleep(1000);
		email.sendKeys(username);
		
		WebElement pwdfield=driver.findElement(By.id("Password"));
		pwdfield.clear();
		Thread.sleep(1000);
		pwdfield.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		String Actualtitle="Dashboard / nopCommerce administration";
		Thread.sleep(1000);
		String exptitle=driver.getTitle();
		
		if(value.equals("Valid"))
		{
			if(Actualtitle.equals(exptitle))
			{
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(value.equals("Invalid"))
		{
			if(Actualtitle.equals(exptitle))
			{
				driver.findElement(By.linkText("logout")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
	}
	@DataProvider(name="LoginData")
	public String [][] getData()
	{
		String TestData[][]= {
				{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","admin1","Invalid"},
				{"admin1@yourstore.com","admin","Invalid"},
				{"admin1@yourstore.com","admin1","Invalid"}
		};
		
		return TestData;	
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	

}
