package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_script1 {
@FindBy(id="email")
private WebElement un;
@FindBy(id="pass")
private WebElement pw;
@FindBy(xpath = "//button[.='Log in']")
private WebElement button;
public POM_script1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void user(String uname)
{
	un.sendKeys(uname);
}
public void password(String pwd)
{
	pw.sendKeys(pwd);
}
public void login()
{
	button.click();
}
}
