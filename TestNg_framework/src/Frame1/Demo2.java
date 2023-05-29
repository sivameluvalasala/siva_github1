package Frame1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
@Test(groups = {"siva"})
public void Bye()
{
	Reporter.log("4",true);
}
@Test(groups = {"karthik"})
public void Bye1()
{
	Reporter.log("5",true);
}
@Test(groups = {"siva","karthik"})
public void Bye2()
{
	Reporter.log("6",true);
}
}
