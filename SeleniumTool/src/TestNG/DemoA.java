package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA 
{
@Parameters({"un","pwd"})
@Test
public void loginpageTest(String un,String pwd)
{
	Reporter.log("username==>", true);
	Reporter.log("password==>", true);
}
}
