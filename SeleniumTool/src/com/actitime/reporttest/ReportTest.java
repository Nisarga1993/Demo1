package com.actitime.reporttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	@Test(groups= {"smokeTest"})
	public void reporterTest()
	{
		Reporter.log("CustomerTest is executed");
	}
@Test(groups= {"regressionTest"})
	public void CustomerReporterTest() {
		Reporter.log("modifyCustomerTest is Executed");
	}

}
