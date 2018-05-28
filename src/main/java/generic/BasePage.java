package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage
{

public void Elementpresent(WebElement element, WebDriver driver)
{
	try
	{
WebDriverWait w= new WebDriverWait(driver,10);
w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present", true);
	}
	catch(Exception e)
	{
		Reporter.log("element is not present", false);
	}
}
public void Verifyelement(WebDriver driver)
{
	try
	{
	   WebDriverWait w= new  WebDriverWait(driver, 10);
	   w.until(ExpectedConditions.titleIs("face"));
		Reporter.log("element is verified", true);
	}
	catch(Exception e)
	{
		Reporter.log("element is not verified", false);
	}
}
}
