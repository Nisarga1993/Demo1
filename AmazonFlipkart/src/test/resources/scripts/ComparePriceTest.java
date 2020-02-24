package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.AmazonHomePage;

public class ComparePriceTest extends BaseTest 
{
	WebDriver driver;
	@Test
	public void priceCompare()
	{
		AmazonHomePage ah=new AmazonHomePage( driver);
		ah.searchPhone();
		
	}

}
