package POM;

import org.testng.annotations.Test;

import Frame1.Generic_Script;

public class Test_script2 extends Generic_Script {
@Test
public void zomzto_app() throws InterruptedException
{
	Pom_script2 p=new Pom_script2(driver);
	p.search_product1();
	p.search_product();
	Thread.sleep(2000);
	p.click_on();
	Thread.sleep(2000);
	
	p.vegitarian();
	Thread.sleep(2000);
	p.dining_out();
}
}
