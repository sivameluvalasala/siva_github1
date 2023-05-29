package Frame1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
@Test(groups = {"karthik"})
public void hi()
{
	Reporter.log("1",true);
}
@Test(groups = {"siva"})
public void hi1()
{
	Reporter.log("2",true);
}
@Test(groups = {"karthik","siva"})
public void hi2()
{
	Reporter.log("3",true);
}
}
