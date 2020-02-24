package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demochrom2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//open the browser
		ChromeDriver driver=new ChromeDriver();
		//minimize the browser
		driver.manage().window().maximize();
		//enter URL and print it
		String title=driver.getTitle();
		System.out.println("Title of the webpage is:"+title);
		//get the current URL
		String cur1=driver.getCurrentUrl();
		System.out.println("The Current URL is:"+cur1);
		//close the Current Browser
		driver.close();
		
	}

}
