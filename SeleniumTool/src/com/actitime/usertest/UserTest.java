package com.actitime.usertest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserTest {
	@Test(groups= {"smokeTest"})
	public void createdUser()
	{
		Reporter.log("userTest is executed");
	}
@Test(groups= {"regressionTest"})
	public void modifyCustomerTest() {
		Reporter.log("modifyTest is Executed");
	}
}
