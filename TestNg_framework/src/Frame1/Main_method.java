package Frame1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_method{
public static void main(String[] args) {
	String value1 = Data_generic.get_data("Sheet1", 0, 0);
	System.out.println(value1);
	String value2 = Data_generic.get_data("Sheet1", 0, 1);
	System.out.println(value2);
	System.setProperty("webdriver.chrome.driver", "./sw1/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.name("email")).sendKeys(value1);
	driver.findElement(By.id("pass")).sendKeys(value2);
	driver.findElement(By.name("login")).click();
	
	
}
}
