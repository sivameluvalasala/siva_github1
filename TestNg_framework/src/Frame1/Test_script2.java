package Frame1;

import org.openqa.selenium.By;

public class Test_script2 extends Generic_Script{
public void insta()
{
	driver.findElement(By.xpath("//span[.='Phone number, username, or email']")).sendKeys("hi");
	driver.findElement(By.xpath("//span[.='Password']")).sendKeys("karthik");
	driver.findElement(By.xpath(""));
}
}
