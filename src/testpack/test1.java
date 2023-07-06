package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepack.page1;

public class test1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart");
		driver.manage().window().maximize();
	}
	@Test
	public void test()throws InterruptedException
	{
		page1 ob= new page1(driver);
		ob.click();
		Thread.sleep(2000);
		ob.click2();
		Thread.sleep(3000);
		ob.setvalues("Akshay","ak","akshay765@gmail.com","9961844869","akzy123","akzy123");
		Thread.sleep(4000);
		ob.click3();
		Thread.sleep(2000);
		ob.click4();
		Thread.sleep(3000);
		ob.click5();
	}

}
