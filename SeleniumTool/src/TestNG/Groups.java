package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups 
	{
		@Test(priority=2,groups = "D")
		public void deleteUser()
		{
			Reporter.log("UserDeleted:",true);
		}
		@Test(priority=1,groups = "E")
		public void editUser()
		{
			Reporter.log("Useredit:",true);
		}
		@Test(priority=0,groups= {"D","E"})
		public void createUser()
		{
			Reporter.log("UserCreateds:",true);
		}
	}



