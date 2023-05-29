package Frame1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_execution {
	WebDriver driver;
@Parameters({"browsers"})
@Test
public void Test(String browser)
{
	System.setProperty("webdriver.chrome.driver", "./sw1/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./sw1/geckodriver.exe");
	if(browser.equals("Chrome"))
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	else
	{
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}
}
}
