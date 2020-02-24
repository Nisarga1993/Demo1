package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Operations 
{
	@Test(priority=2,dependsOnMethods = "createUser")
	public void deleteUser()
	{
		Reporter.log("UserDeleted:",true);
	}
	@Test(priority=1,dependsOnMethods = "createUser")
	public void editUser()
	{
		Reporter.log("Useredit:",true);
	}
	@Test(priority=0,invocationCount=0)
	public void createUser()
	{
		Assert.fail();
		Reporter.log("UserCreateds:",true);
	}
}
