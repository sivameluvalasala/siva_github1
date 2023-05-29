package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_script2 {
	@FindBy(xpath = "//input[@placeholder='Search for restaurant, cuisine or a dish']")
	private WebElement search1;
@FindBy(xpath = "//input[@placeholder='Search for restaurant, cuisine or a dish']")
private WebElement search;
@FindBy(xpath = "//p[.='Biryani - Delivery']")
private WebElement click;
@FindBy(xpath = "(//div[.='Pure Veg'])[1]")
private WebElement veg;
@FindBy(xpath = "(//div[.='Dining Out'])[2]")
private WebElement dining;
public Pom_script2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void search_product1()
{
	search1.click();
}
public void search_product()
{
	search.sendKeys("biriyani");
}
public void click_on()
{
	click.click();
}
public void vegitarian()
{
	veg.click();
}
public void dining_out()
{
	dining.click();
}
}
