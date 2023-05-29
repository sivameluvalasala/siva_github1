package POM;


import org.testng.annotations.Test;

import Frame1.Generic_Script;

public class Test_script1 extends Generic_Script {
@Test
public void valid() throws InterruptedException
{
	
	POM_script1 p=new POM_script1(driver);
	p.user("siva");
	Thread.sleep(2000);
	p.password("siva");
	Thread.sleep(2000);
	p.login();
	
}
}
