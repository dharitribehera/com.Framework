package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant
{
WebDriver driver;

	@BeforeMethod
	public void open()
	{
		System.setProperty(Key ,VALUE);
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	

}



