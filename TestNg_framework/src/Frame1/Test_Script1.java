package Frame1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Script1 extends Generic_Script{
@Test
public void login() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("Admin");
	driver.findElement(By.id("pass")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
}

}
