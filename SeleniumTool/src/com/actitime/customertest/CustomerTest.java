package com.actitime.customertest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerTest {
	@Test(groups= {"smokeTest"})
	public void customerTest()
	{
		Reporter.log("CustomerTest is executed");
	}
@Test(groups= {"regressionTest"})
	public void modifyCustomerTest() {
		Reporter.log("modifyCustomerTest is Executed");
	}

}
